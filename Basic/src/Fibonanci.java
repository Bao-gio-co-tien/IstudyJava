package Basic;

public class Fibonanci {
    public static void main(String[] args) {
        int F1 = 0;
        int F2 = 1;
        for (int index = 1; index < 20; index++) {
            int Fn = F1 + F2;
            F1 = F2;
            F2 = Fn;
            System.out.print(Fn + " ");
        }
    }
}
