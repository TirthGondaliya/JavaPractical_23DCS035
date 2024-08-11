import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        String str ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        str = sc.nextLine();
        
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        String lowercaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseStr);
        
        String uppercaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseStr);
        
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
    }
    
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
