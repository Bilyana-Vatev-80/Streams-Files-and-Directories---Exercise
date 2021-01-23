import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles_7 {
    public static void main(String[] args) throws IOException {
        Path firstPath = Path.of("C:\\Users\\bilya\\Dropbox\\My PC (DESKTOP-68H33HR)\\Desktop\\04. " +
                "Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path secondPath = Path.of("C:\\Users\\bilya\\Dropbox\\My PC (DESKTOP-68H33HR)\\Desktop\\04. " +
                "Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        List<String> linesFirst = Files.readAllLines(firstPath);
        List<String> linesSecond = Files.readAllLines(secondPath);

        PrintWriter writer = new PrintWriter("merge.txt");

        linesFirst.forEach(writer::println);
        linesSecond.forEach(writer::println);

        writer.close();
    }
}
