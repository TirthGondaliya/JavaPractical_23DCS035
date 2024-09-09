import java.util.*;

interface AdvancedArithmetic{
    public int divisor_sum(int n);
}

 class MyCalculator implements AdvancedArithmetic{
    // @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum;
    }
 }

public class p22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyCalculator m = new MyCalculator();
        System.out.print("Enter Number : ");
        int n = s.nextInt();
        System.out.println("Sum of the Divisors of " + n + " is "  + m.divisor_sum(n));
        s.close();
    }
}
