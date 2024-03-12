package Basic;

import java.util.Scanner;

public class CmToInch {
    public static void main(String[] args) {
        double inch = 2.54;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap do dai: ");
        int cm = scanner.nextInt();
        float change = (float) (inch * cm);
        System.out.println(change);
    }
}
