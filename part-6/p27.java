import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p27 {
    public static void main(String[] args) {
        for (String filename : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                int lineCount = 0 ;
                String line;
                while ((line = reader.readLine()) != null) {
                    lineCount ++ ;
                }
                System.out.println(filename + ": " + lineCount);
            } catch (IOException e) {
                System.err.println("Error reading file " + filename + ": " + e.getMessage());
            }
        }
    }
}