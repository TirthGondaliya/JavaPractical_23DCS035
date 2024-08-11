import java.util.*;

class Area{
    double length;
    double breadth; 

    Area(){}

    Area(double l , double b){
        length = l;
        breadth = b;
    }

    double returnArea(){
        return length*breadth;
    }
}

public class p15 {
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Length Of Rectangle : ");
        double l = s.nextDouble();
        System.out.print("Enter Breadth Of Rectangle : ");
        double b = s.nextDouble();
        Area a1 = new Area(l,b);
        System.out.println(a1.returnArea());
        s.close();
    }
}


