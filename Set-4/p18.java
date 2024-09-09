import java.util.*;

class member {
    static String name;
    static int age;
    static long ph_number;
    static String address;
    static int salary;

    void set_data(Scanner s) {
        System.out.print("Enter Name : ");
        name = s.nextLine();
        System.out.print("Enter Age : ");
        age = s.nextInt();
        System.out.print("Enter Phone Number : ");
        ph_number = s.nextInt();
        System.out.print("Enter Address : ");
        s.nextLine();
        address = s.nextLine();
        System.out.print("Enter Salary : ");
        salary = s.nextInt();
    }

    void printSalary() {
        System.out.println("Salary : " + salary);
    }

    void get_data() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone Number : " + ph_number);
        System.out.println("Address : " + address);
        printSalary();
    }
}

class employee extends member {
    static String specialization;

    void set_specialization(Scanner s) {
        System.out.print("Enter Specialization : ");
        s.nextLine();
        specialization = s.nextLine();
        set_data(s);
    }

    void get_specialization() {
        System.out.println();
        System.out.println("Employee Detail : ");
        System.out.println("Specialization : " + specialization);
        get_data();
    }
}

class manager extends member {
    static String department;

    void set_department(Scanner s) {
        System.out.println("Enter Department : ");
        s.nextLine();
        department = s.nextLine();
        set_data(s);
    }

    void get_department() {
        System.out.println();
        System.out.println("Manager Detail : ");
        System.out.println("Department : " + department);
        get_data();
    }
}

public class p18{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for Employee Details");
        System.out.println("Enter 2 for Manager Details");
        System.out.print("Choice : ");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                employee e = new employee();
                e.set_specialization(s);
                e.get_specialization();
            break;
            case 2 : 
                manager m = new manager();
                m.set_department(s);
                m.get_department();
            break;
        }
        s.close();
    }
}
