import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount_6 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\bilya\\Dropbox\\My PC (DESKTOP-68H33HR)\\Desktop\\04. " +
                "Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");

        List<String> lines = Files.readAllLines(path);
        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordsCount.put(word, 0);
            }
        }
        Path pathSearched = Path.of("C:\\Users\\bilya\\Dropbox\\My PC (DESKTOP-68H33HR)\\Desktop\\04. " +
                "Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");

        List<String> searchedLines = Files.readAllLines(pathSearched);

        for (String line : searchedLines) {
            Arrays.stream(line.split("\\s+")).forEach(word -> {
                if (wordsCount.containsKey(word)) {
                    wordsCount.put(word, wordsCount.get(word) + 1);
                }
            });
        }
        PrintWriter writer = new PrintWriter("results.txt");
        for (Map.Entry<String, Integer> words : wordsCount.entrySet()) {
            writer.println(words.getKey() + " - " + words.getValue());
        }
        writer.close();
    }
}
