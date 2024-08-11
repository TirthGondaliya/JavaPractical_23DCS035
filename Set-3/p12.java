 public class p12 {
    public static void main(String[] args) {
        
    
    // here String arg[] is command line argument
    // Integer.parseInt() is convert string into int
        int pounds = Integer.parseInt(args [0]);
        int rupees = pounds * 100;
        System.out.println(pounds +" Pounds = " + rupees + " Rupees");
    }
 }

