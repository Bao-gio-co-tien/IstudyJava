package Basic;

import java.util.Scanner;

public class DayInWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hay nhap 1 con so bat ky tu 1 - 7: ");
            int number = scanner.nextByte();
            if (number < 1 || number > 7) {
                System.out.println("Nhap chua dung con so yeu cau.");
                continue;
            }
            else {
                switch (number) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
                break;
            }
        }

    }
}
