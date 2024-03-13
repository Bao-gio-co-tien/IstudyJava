import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3();
        Book book = new Book();

        mp3.anMP3("DRX3000","It have a powerful sound", "N.124", 30, 40000);

        book.aBook("Discrete Mathematics and Its Applications",
                "A discrete mathematics course has more than one purpose. Students should learn a particular set of mathematical facts and how to apply them",
                "B02", 49, "Kenneth H. Rosen", 1117, "Education");

        mp3.showInfo();
        System.out.println();
        book.showInfo();
    }
}