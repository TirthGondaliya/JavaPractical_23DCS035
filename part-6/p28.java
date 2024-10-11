import java.io.FileReader;
import java.io.IOException;

public class p28 {
    public static void main(String[] args) throws IOException {
        // Check if argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a character as argument.");
            return;
        }

        char findChar = args[0].charAt(0);
        int count = 0;

        try (FileReader f = new FileReader("File.txt")) {
            int ch;
            while ((ch = f.read()) != -1) {
                if (findChar == (char) ch) {
                    count++;
                }
            }
        }

        System.out.println(findChar + " occurs " + count + " times.");
    }
}