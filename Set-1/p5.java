 import java.util.*;

public class p5 {

    public static void main(String[] args) {

        System.out.println("electric application shop");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter how many product you want buy :");
        int product = sc.nextInt();

        int[] itemcode = new int[product];
        float[] prize = new float[product];
        float sum = 0;

        System.err.println("1:motor\n2:fan\n3:tube\n4:wires\n5:all others");
        for (int i = 0; i<product; i++) {
            int item;
            System.out.print("enter item code :");
            item = sc.nextInt();
            itemcode[i] = item;
            System.out.print("enter product prize :");
            prize[i] = sc.nextFloat();

            switch (item) {
                case 1 :
                    prize[i] += prize[i] * 0.08f;
                    break;
                case 2 : 
                    prize[i] += prize[i] * 0.12f;
                    break;
                case 3 :
                    prize[i] += prize[i] * 0.05f;
                    break;
                case 4 :
                    prize[i] += prize[i] * 0.075f;
                    break;
                case 5 :
                    prize[i] += prize[i] * 0.03f;
                    break;
                default :
                    System.out.println("enter valid product code...");
            }
            sum += prize[i];
        }
        System.out.println("\nelectric appliance shop bill");
        for (int i = 0; i<product; i++) {
            System.out.println(itemcode[i] + "                  " + prize[i]);
        }
        System.out.println("====================================");
        System.out.println("your total amount :" + sum);
        
    }
}
