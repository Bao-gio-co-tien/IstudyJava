import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("ClassQ3_vn.doc");
            BufferedReader br = new BufferedReader (in);
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                String []parts = line.split(" ");
                for(String w : parts)
                {
                    count++;
                }
                line = br.readLine();
            }
            System.out.println(count);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
