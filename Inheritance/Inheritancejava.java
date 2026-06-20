package Inheritance;

class Delivery {
	   void deliver() {
			   System.out.println("Order is out for delivery");
	   }
	}

	class ExpressDelivery extends Delivery {
			  void speed() {
			      System.out.println("Delivered within 30 minutes");
			  }
	  }

	class StandardDelivery extends Delivery {
	    void speed() {
			   System.out.println("Delivered within 2 hours");
			 }
	    }

	public class Inheritancejava {
		public static void main(String[] args) {
			ExpressDelivery  obj = new ExpressDelivery();
			StandardDelivery obj1 = new StandardDelivery();
			     obj.deliver();
			     obj.speed();
			     obj1.speed();
		}
	}


