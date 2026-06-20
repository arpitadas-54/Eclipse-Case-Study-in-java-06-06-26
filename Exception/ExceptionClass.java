package Exception;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       try {
            int amount = -200;

            if (amount <= 0) {
                throw new Exception("Invalid payment amount");
            }

            System.out.println("Order placed successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
       System.out.println("Thank you for using the app");
    }
}
}
