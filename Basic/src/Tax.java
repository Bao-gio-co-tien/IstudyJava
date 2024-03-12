package Basic;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        double tax = 0.0825;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien ban dau: ");
        double price = scanner.nextDouble();
        double taxPay = tax*price;
        double totalPrice = price + taxPay;
        System.out.println(taxPay + " " + totalPrice);
    }
}
