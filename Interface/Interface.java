package Interface;

interface User {
	  void login();
	  void logout();
	 }

	class Customer implements User {
		public void login() {
	    System.out.println("Customer logged in");
	}

	public void logout() {
	   System.out.println("Customer logged out");
	  }
	}

	class DeliveryBoy implements User {
		public void login() {
		  System.out.println("Delivery Boy logged in");
	 }

	   public void logout() {
		  System.out.println("Delivery Boy logged out");
	   }
	}

	public class Interface {
	   public static void main(String[] args) {
			User obj = new Customer();
			obj.login();
			obj.logout();
	   }
	}


