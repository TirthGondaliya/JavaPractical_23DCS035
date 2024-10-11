import java.io.*;

class p31 {
public static void main(String[] args) {
// Demonstrate character stream
try (FileReader fr = new FileReader("input.txt");
FileWriter fw = new FileWriter("output_char.txt")) {
int c;
while ((c = fr.read()) != -1) {
fw.write(c);
}
System.out.println("Character stream copy completed.");
} catch (IOException e) {
System.err.println("Error with character stream: " + e.getMessage());
}

// Demonstrate byte stream
try (FileInputStream fis = new FileInputStream("input.txt");
FileOutputStream fos = new FileOutputStream("output_byte.txt")) {
byte[] buffer = new byte[1024];
int bytesRead;
while ((bytesRead = fis.read(buffer)) != -1) {
fos.write(buffer, 0, bytesRead);
}
System.out.println("Byte stream copy completed.");
} catch (IOException e) {
System.err.println("Error with byte stream: " + e.getMessage());
}

// Use BufferedReader and BufferedWriter to read from console and write to a file
try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new FileWriter("console_output.txt"))) {
System.out.println("Enter text (type 'exit' to finish):");
String line;
while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
bw.write(line);
bw.newLine();
}
System.out.println("Console input written to file.");
} catch (IOException e) {
System.err.println("Error with BufferedReader/BufferedWriter: " + e.getMessage());
}
}
}
