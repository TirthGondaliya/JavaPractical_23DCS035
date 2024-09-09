import java.util.*;
class rectangle{
    int length;
    int breadth;

    rectangle(){}

    rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void rec_para(){
        System.out.println("Rec - Parameter : " + 2*(length+breadth));
    }
    void  rec_area(){
        System.out.println("Rec - Area " + length*breadth);
    }
}

class square extends rectangle{
    int side;

    square(int side){
        super(side,side);
        this.side = side;
    }
    void sq_para(){
        System.out.println("Square Parameter : " + 4*side);
    }
    
    void sq_area(){
        System.out.println("Squarev Area : " + side*side);
    }

}

public class p19 {
    public static void main(String[] args) {
        square s = new square(10);
        s.rec_area();
        s.rec_para();
        s.sq_area();
        s.sq_para();
    }
}
