class Bike2{  
  final void run(){System.out.println("running...");}  
}  
class Honda2 extends Bike2{  
   public static void main(String args[]){  
    new Honda2().run();  
   }  
}