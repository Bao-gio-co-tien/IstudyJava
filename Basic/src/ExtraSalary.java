package Basic;

import java.util.Scanner;

public class ExtraSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so gio lam viec: ");
        int hour = scanner.nextByte();
        System.out.println("Hay nhap so tien luong moi gio: ");
        int pay = scanner.nextInt();
        int salary = hour * pay;
        System.out.println(salary);
        if (pay < 25000 || hour > 40 ) {
            System.out.println("Ban dang bi quan ly boc lot suc lao dong");
        }
        else {
            System.out.println("Ban dang lam cong viec cua minh rat tot");
        }
    }
}
