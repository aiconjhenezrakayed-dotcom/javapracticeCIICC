public class Divider {
    
    public static void divide(int a, int b) {
        try {
            // Dangerous code: dividing by zero throws an exception
            int result = a / b;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // The safety net!
            System.out.println("Oops! You cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test 1: Dividing 10 by 2");
        divide(10, 2); 

        System.out.println("\nTest 2: Dividing 10 by 0");
        divide(10, 0); 
    }
}