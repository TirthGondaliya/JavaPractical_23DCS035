import java.util.*;
public class p3{
          public static void main(String args[])
	{
	        float dist,min,hrs,sec;
		System.out.println("Enter Distance in Meters");
		Scanner s = new Scanner(System.in);
		dist = s.nextFloat();
		System.out.println("Enter Time in Hours");
		hrs = s.nextFloat();
		System.out.println("Enter Time in Minutes");
		min = s.nextFloat();
		System.out.println("Enter Time in Seconds");
		sec = s.nextFloat();
		
		float kilometer = dist/1000;
		float mile = dist/1609;
		float totalmin = min + (hrs*60) + (sec/60);
		float totalhrs = totalmin/60;
		float totalsec = totalmin*60;
                
		System.out.println("Your Speed in");
		System.out.println("Meters per Second:"+dist/totalsec);
		System.out.println("Kilometers per Hour:"+kilometer/totalhrs);
		System.out.println("Miles per Hour:"+mile/totalhrs);
	}
}