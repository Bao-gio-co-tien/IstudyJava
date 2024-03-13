import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) throws IOException {
        String newDir = "D:/myFile";
        File file = new File(newDir);
        file.mkdirs();

        File newF = new File(newDir, "13March.txt");
        newF.createNewFile();
    }
}
