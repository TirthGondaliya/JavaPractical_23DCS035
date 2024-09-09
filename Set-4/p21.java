class degree{
    public void getDegree(){
        System.out.println("I got a Degree");
    }
}

class undergraduate extends degree{
    public void getDegree(){
        System.out.println("I am an Undergraduate");
    }
}

class postgraduate extends degree{
    public void getDegree(){
        System.out.println("I am an Postgraduate");
    }
}

public class p21 {
    public static void main(String[] args) {
        degree d = new degree();
        undergraduate u = new undergraduate();
        postgraduate p = new postgraduate();

        d.getDegree();
        u.getDegree();
        p.getDegree();
    }
}
