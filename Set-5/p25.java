public class p25 {

    public static void main(String[] args) {
        try {
            
            int number = 10;
            int result = number / 0; 
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println(" Division by zero  not allowed.");
        }

        System.out.println("Program continues after the try-catch block.");
    }
}
