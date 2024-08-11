import java.util.*;

class Employee{
    Scanner s = new Scanner(System.in);
    String fn;
    String ln;
    double salary;

    Employee(){}

    Employee(String f , String l , double s){
        fn = f;
        ln = l;
        salary = s;
    }

    void set_fn(){
        System.out.print("Enter First Name : ");
        fn = s.nextLine();
    }
    void set_ln(){
        System.out.print("Enter Last Name : ");
        ln = s.nextLine();
    }
    void set_salary(){
        System.out.print("Enter Salary : ");
        salary = s.nextDouble();
        if(salary<0){
            salary = 0.0;
        }
    }
    void set_newSalary(){
        salary += salary*0.1;
    }
    String get_fn(){
        System.out.print("First Name : ");
        return fn;
    }
    String get_ln(){
        System.out.print("Last Name : ");
        return ln;
    }
    double get_salary(){
        System.out.print("Salary : ");
        return salary;
    }
    double get_newSalary(){
        System.out.print("Salary after 10% increment : ");
        return salary;
    }
}

public class p13 {
    public static void main(String arg[]){
        
        Employee e1 = new Employee();
        System.out.println("Enter Detail of Employee " );
        e1.set_fn();
        e1.set_ln();
        e1.set_salary();
        System.out.println(e1.get_fn());
        System.out.println(e1.get_ln());
        System.out.println(e1.get_salary());
        e1.set_newSalary();
        System.out.println(e1.get_newSalary());

        Employee e2 = new Employee();
        System.out.println("Enter Detail of Employee " );
        e2.set_fn();
        e2.set_ln();
        e2.set_salary();
        System.out.println(e2.get_fn());
        System.out.println(e2.get_ln());
        System.out.println(e2.get_salary());
        e2.set_newSalary();
        System.out.println(e2.get_newSalary());
    }
}

