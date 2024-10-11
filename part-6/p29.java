import java.util.*;
import java.io.*;

public class p29 {
public static void main(String[] args) {   
Scanner sc = new Scanner(System.in);
File file = null;

while (file == null) {
if (args.length > 0) {
file = new File(args[0]);
} else {
System.out.print("Please enter the correct file name: ");
args = new String[]{sc.nextLine()};
file = new File(args[0]);
}

if (!file.exists()) {
System.out.println(file.getName() + " not found.");
file = null;
}
}

try {
System.out.print("Enter the word you want to search for in " + file.getName() + ": ");
String userWord = sc.nextLine();
userWord = userWord.trim();

Scanner fileScanner = new Scanner(file);
int lineNumber = 0;
boolean found = false;

while (fileScanner.hasNextLine()) {
lineNumber++;
String line = fileScanner.nextLine();
int wordStart = -1;

for (int i = 0; i <= line.length(); i++) {
char c = (i < line.length()) ? line.charAt(i) : ' ';
if (Character.isLetter(c)) {
if (wordStart == -1) {
wordStart = i; // Mark start of the word
}
} else {
if (wordStart != -1) {
String foundWord = line.substring(wordStart, i);
if (userWord.equalsIgnoreCase(foundWord)) {
System.out.println("Word \"" + userWord + "\" found in line " + lineNumber + " in " + file.getName());
found = true;
}
wordStart = -1; // Reset for the next word
}
}
}
}

if (!found) {
System.out.println("Word \"" + userWord + "\" not found in the file.");
}

fileScanner.close();
} catch (IOException e) {
System.out.println("An error has occurred while reading the file.");
e.printStackTrace();
} finally {
sc.close();
}
}
}
