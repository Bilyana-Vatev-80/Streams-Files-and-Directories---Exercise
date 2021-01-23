import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers_5 {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("C:\\Users\\bilya\\Dropbox\\My PC (DESKTOP-68H33HR)\\Desktop\\04. " +
                "Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");

        List<String> lines = Files.readAllLines(pathFile);
        PrintWriter writer = new PrintWriter("output.txt");
        int row = 1;
        for (String line : lines) {
            writer.println(row++ + ". " + line);
        }
        writer.close();
    }
}
