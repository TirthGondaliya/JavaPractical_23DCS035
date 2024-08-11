import java.util.*;

public class p8 {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(array_count9(arr));
    }
    
    public static int array_count9(int[] nums) {
        int count = 0;
        for ( int i=0 ; i<nums.length ; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }
}
