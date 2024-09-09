class shape{
    void print1(){
        System.out.println("This is Shape");
    }
}

class rectangle extends shape{
    static class square extends rectangle{
        void print4(){
            System.out.println("Square is a Rectangle");
        }
    }
    void print2(){
        System.out.println("This is Rectangle Shape");
    }
}

class circle extends shape{
    void print3(){
        System.out.println("This is Circuler Shape");
    }
}

public class p20 {
    public static void main(String[] args) {
        rectangle.square s = new rectangle.square();
        s.print4();
        s.print1();
        s.print2();
    }
}   


    