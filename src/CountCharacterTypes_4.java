import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CountCharacterTypes_4 {
    public static void main(String[] args) throws IOException {
        String pathFile = "C:\\Users\\bilya\\Dropbox\\My PC (DESKTOP-68H33HR)\\Desktop\\04. " +
                "Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        int countVowels = 0;
        int contConsonants = 0;
        int countPunctuation = 0;

        String vowel = "aeiou";
        String punctuation = "!,.?";

        BufferedReader reader = new BufferedReader(new FileReader(pathFile));

        String line = reader.readLine();
        while (line != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                for (char symbol : word.toCharArray()) {
                    String charAsString = String.valueOf(symbol);
                    if (vowel.contains(charAsString)) {
                        countVowels++;
                    } else if (punctuation.contains(charAsString)) {
                        countPunctuation++;
                    } else {
                        contConsonants++;
                    }
                }
            }
            line = reader.readLine();
        }
        reader.close();

        PrintWriter writer = new PrintWriter("outputCount.txt");
        writer.println("Vowels: " + countVowels);
        writer.println("Consonants: " + contConsonants);
        writer.println("Punctuation: " + countPunctuation);

        writer.close();
    }
}
