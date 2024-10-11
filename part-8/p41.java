import java.util.*;
import java.io.*;

public class p41{
public static void main(String[] args) throws IOException{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the file name you want to scan : ");
String f = sc.nextLine();
File file = new File(f);
FileReader br = new FileReader(file);
BufferedReader fr = new BufferedReader(br);
String keywords[] = new String[]{"abstract","assert ","boolean","break","byte","case","catch","char","class",
"continue","default","do","double","else","enum ","extends","final","finally",
"float","for","if","implements","import","instanceof","int","interface","long",
"native","new","package","private","protected","public","return","short","static",
"strictfp","super","switch","synchronized","this","throw","throws","transient","try",
"void","volatile","while"};
HashSet<String> set = new HashSet<String>();
for(int i =0;i < keywords.length; ++i){
set.add(  keywords[i] );
}
String st;
int count =0 ;
while ((st = fr.readLine()) != null){
StringTokenizer str = new StringTokenizer( st, " +-/*%<>;:=&|!~()");

while(str.hasMoreTokens()){
String swre = str.nextToken();
if(set.contains(swre )){
count++;
}
}
}
System.out.println("Total keywords are : " + count);
fr.close();
sc.close();
}
}
