import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class allCapitals_3 {
    private static Object PrintWriter;

    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("C:\\Users\\bilya\\Dropbox\\My PC (DESKTOP-68H33HR)\\Desktop\\04. " +
                "Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(pathFile);
        File outPutFile = new File("C:\\Users\\bilya\\Dropbox\\My PC (DESKTOP-68H33HR)\\Desktop\\04. " +
                "Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        PrintWriter writer = new PrintWriter(outPutFile);
        lines.forEach(line -> writer.println(line.toUpperCase()));
        writer.close();
    }
}
