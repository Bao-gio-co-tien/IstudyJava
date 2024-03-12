package Basic;

import java.util.Scanner;

public class VariableArgs {
    static void sum(int...x) {
        int s = 0;
        for (int i = 0; i < x.length; i++) {
            s = s + x[i];
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        sum(3, 7, 3, 4, 2, 6, 4, 8, 33);
    }
}
