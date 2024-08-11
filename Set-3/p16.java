import java.util.Scanner;

class Complex {
    int r, i;
    int sumi, sumr;
    Scanner s = new Scanner(System.in);

    void setr() {
        System.out.print("Enter real number: ");
        r = s.nextInt();
    }

    void seti() {
        System.out.print("Enter imaginary number: ");
        i = s.nextInt();
    }

    void sum(Complex c) {
        sumi = i + c.i;
        sumr = r + c.r;
        System.out.println(sumr + "+" + sumi + "i");
    }

    void difference(Complex c) {
        int difi = i - c.i;
        int difr = r - c.r;
        if (difi >= 0) {
            System.out.println(difr + "+" + difi + "i");
        } else {
            System.out.println(difr + "" + difi + "i");
        }
    }

    void product(Complex c) {
        // (r, i) * (c.r, c.i)
        int pror = (r * c.r) - (i * c.i);
        int proi = (r * c.i) + (i * c.r);
        if (proi >= 0) {
            System.out.println(pror + "+" + proi + "i");
        } else {
            System.out.println(pror + "" + proi + "i");
        }
    }
}

public class p16 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.setr();
        c1.seti();
        c2.setr();
        c2.seti();
        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);
    }
}
