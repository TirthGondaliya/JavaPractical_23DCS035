import java.util.*;

public class p9 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        str = sc.nextLine();
        System.out.println(double_char(str)); 
        }
    
    public static String double_char(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c); 
        }
        
        return result.toString();
    }
}
