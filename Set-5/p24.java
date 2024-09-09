import java.util.*;

public class p24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter Number x: ");
            int x = scanner.nextInt();
            
            System.out.print("Enter Number y: ");
            int y = scanner.nextInt();
            
            System.out.println("x/y=" + x/y);
            
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (Exception e) {
            System.out.println("Input must be Integer");
        }  
    }
}