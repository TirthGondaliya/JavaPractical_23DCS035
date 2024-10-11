import java.util.*;

public class p40 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the text: ");
String inputText = sc.nextLine();

inputText = inputText.toLowerCase();
HashMap<String, Integer> wordCountMap = new HashMap<>();

StringBuilder currentWord = new StringBuilder();

for (int i = 0; i < inputText.length(); i++) {
char c = inputText.charAt(i);

if (Character.isLetter(c) || Character.isDigit(c)) {
currentWord.append(c);
} else {
if (currentWord.length() > 0) {
String word = currentWord.toString();
wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
currentWord.setLength(0);
}
}
}

if (currentWord.length() > 0) {
String word = currentWord.toString();
wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
}

TreeSet<String> sortedWords = new TreeSet<>(wordCountMap.keySet());

System.out.println("Word occurrences:");
for (String word : sortedWords) {
System.out.println(word + ": " + wordCountMap.get(word));
}

sc.close();
}
}
