class Parent{
    void printparent(){
        System.out.println("This is Parent class");
    }
}
class Child extends Parent{
    void printchild(){
        System.out.println("This is Child class");
    }
}

public class p17{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printparent();

        Child child = new Child();
        child.printchild();
    }
}