import java.util.*;
import java.io.*;

public class p30 {

public static void main(String[] args) throws IOException,FileNotFoundException {
String source, destination;
FileReader source_f;
File f;
Scanner sc = new Scanner(System.in);

System.out.println("Enter Filename to Copy : ");
source = sc.nextLine();
source_f = new FileReader(source);

System.out.println("Enter Destination Filename : ");
destination = sc.nextLine();
f = new File(destination);
FileWriter destination_f;

if(!f.exists())
f.createNewFile();
destination_f = new FileWriter(destination);

int c = source_f.read();
while(c!=-1) {
destination_f.write(c);
c = source_f.read();
}

System.out.println("File Copied successfully...");

source_f.close();
destination_f.close();
sc.close();
}

}
