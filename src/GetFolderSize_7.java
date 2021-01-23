import java.io.File;

public class GetFolderSize_7 {
    public static void main(String[] args) {
        String path = "C:\\Users\\bilya\\Dropbox\\My PC (DESKTOP-68H33HR)\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";

        File folder = new File(path);

        long size = 0;
        for (File file : folder.listFiles()) {
            size += file.length();
        }
        System.out.println("Folder size: " + size);
    }
}
