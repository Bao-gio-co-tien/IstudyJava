package Basic;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        try {
            int divide = num1 / num2;
            System.out.println(divide);
        }
        catch (Exception e) {
            System.out.println("Chia cho so 0");
        }
    }
}
