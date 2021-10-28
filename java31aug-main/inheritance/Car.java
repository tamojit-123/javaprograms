//combination of IS-A relation Ship and Has-a Releation Ship

class Car {
	// Methods implementation and class/Instance members
	String color;
	int maxSpeed;

	void carInfo() {
		System.out.println("Car Color= " + color + " Max Speed= " + maxSpeed);
	}

	void setColor(String color) {
		this.color = color;
	}

	void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}

// is a releation ship
class Maruti extends Car {
	// Maruti extends Car and thus inherits all methods from Car (except final and
	// static)
	// Maruti can also define all its specific functionality
	void MarutiStartDemo() {
		// maruti and engine -- has releationship
		Engine MarutiEngine = new Engine();
		MarutiEngine.start();
	}
}

class Engine {
	void start() {
		System.out.println("Engine Started:");
	}

	void stop() {
		System.out.println("Engine Stopped:");
	}
}

class ReleationDemo {
	public static void main(String[] args) {
		Maruti myMaruti = new Maruti();
		myMaruti.setColor("RED");
		myMaruti.setMaxSpeed(180);
		myMaruti.carInfo();
		myMaruti.MarutiStartDemo();
	}
}