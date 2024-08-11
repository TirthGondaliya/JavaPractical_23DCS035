import java.util.*;

class FrontTimes {

    public String frontTimes(String str, int n) {

        String front = str.length() < 3 ? str : str.substring(0, 3);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(front);
        }

        return result.toString();
    }
}

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        System.out.println("Enter no. of repeatation:");
        int rep = sc.nextInt();
        FrontTimes ft = new FrontTimes();
        System.out.println(ft.frontTimes(str, rep));
    }
}

