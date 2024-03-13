import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        try {
            BufferedWriter bwin = new BufferedWriter(new FileWriter("os.txt"));
            bwin.write("omg I'm doing it, I'm writing to a file");

            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            bwin.write("\n" + string);

            bwin.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}