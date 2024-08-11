import java.util.*;

class Date{
    Scanner s = new Scanner(System.in);
    int day;
    int month;
    int year;

    Date(){}

    Date(int d , int m , int y){
        day = d;
        month = m;
        year = y;
    }

    void set_day(){
        System.out.print("Enter Day : ");
        day = s.nextInt();
    }
    void set_month(){
        System.out.print("Enter Month : ");
        month = s.nextInt();
    }
    void set_year(){
        System.out.print("Enter Year : ");
        year = s.nextInt();
    }
    void displayDate(){
        System.out.println("Date : " + day + "/" + month + "/" + year);
    } 
}

public class p14 {
    public static void main(String arg[]){
        Date d1 = new Date();
        d1.set_day();
        d1.set_month();
        d1.set_year();
        d1.displayDate();
    }
}
