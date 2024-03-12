package Basic;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so gio lam viec: ");
        int hour = scanner.nextByte();
        System.out.println("Hay nhap so tien tra cho moi gio: ");
        int pay = scanner.nextInt();
        int salary = hour * pay;
        System.out.println(salary);
    }
}
