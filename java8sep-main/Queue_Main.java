//queue
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

// Queue Operations
class Queue_Op {
	Node rear = null, front = null;

	public void addQueue(int item) {
		Node node = new Node(item); // allocate a new node in a heap
		System.out.println("Insertint an elementin queue");
		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
	}

	public int deleteQueue() {
		if (front == null) {
			System.out.print("Queue underflow");
			System.exit(1);
		}
		Node temp = front;
		// System.out.println("Removing an element fromqeue:"+temp.data);
		front = front.next; // front to the next node
		// ifthe list becomes empty
		if (front == null) {
			rear = null;
		}
		// deallocate the memory ofthe removednode and optionally return the
		// renmoveditemm
		int num = temp.data;
		return num;
	}

	public int peek() {
		if (front != null) {
			return front.data;
		} else {
			System.out.println("Front andRear is null" + front.data + "\t" + rear.data);
			System.exit(1);
		}
		return -1;
	}
}

class Queue_Main {
	public static void main(String[] ar) {
		Queue_Op op = new Queue_Op();
		// System.out.println("Element in queue:"+op.peek());
		op.addQueue(1);
		System.out.println("Element in queue:" + op.peek());
		op.addQueue(2);
		System.out.println("Element in queue:" + op.peek());
		System.out.println(op.deleteQueue());
		System.out.println("Element in queue:" + op.peek());
		System.out.println(op.deleteQueue());
		System.out.println("Element in queue:" + op.peek());
	}
}