package Basic;

public class MathUtils {
    int max(int x, int y) {
        return Math.max(x, y);
    }

    double max(double x, double y) {
        return Math.max(x, y);
    }

    void max(int[] x) {
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (max <= x[i]) {
                max = x[i];
            }
        }
        System.out.println(max);
    }

    void max(double[] x) {
        double max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (max <= x[i]) {
                max = x[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        System.out.println(mathUtils.max(7,9));
        System.out.println(mathUtils.max(5.4, 9.4));
        int[] x = {4, 7, 2, 6, 8, 19, 3, 10};
        mathUtils.max(x);
        double[] y = {5.5, 6.3, 7.7, 28.4, 5.6};
        mathUtils.max(y);
    }
}
