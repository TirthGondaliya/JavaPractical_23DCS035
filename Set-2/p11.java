public class p11 {
    public static void main(String[] args) {
        String s1 = "CHARUSAT UNIVERSITY";
        
       
        int length = s1.length();
        System.out.println("Length of the string: " + length);
        
        
        String sc = "Tirth";
        char ch = sc.charAt(0);  
         String s2 = s1.replace('H', ch);
        System.out.println("After replacement: " + s2);
        
        String lowercaseString = s1.toLowerCase();
        System.out.println("In lowercase: " + lowercaseString);
    }
}

