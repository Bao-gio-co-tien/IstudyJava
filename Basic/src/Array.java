package Basic;

import java.util.Random;

public class Array {

    public static void main(String[] args) {

        Random random = new Random();
        int[][][] array = new int[3][4][6];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    array[i][j][k] = random.nextInt(1000);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    System.out.printf("%03d ", array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        int min = array[0][0][0];
        int max = array[0][0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    if (max <= array[i][j][k]) {
                        max = array[i][j][k];
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    if (min >= array[i][j][k]) {
                        min = array[i][j][k];
                    }
                }
            }
        }

        System.out.println("So lon nhat trong mang la: " + max);
        System.out.println("So be nhat trong mang la: " + min);
    }
}
