package blq;

public class Example3_6 {
    public static void main(String args[]) {
        double sum = 0, itme = 1;
        int i = 1, n = 20;
        while (i <= n) {
            sum = sum + itme;
            i = i + 1;
            itme = itme * (1.0 / i);
        }
        System.out.println("sum=" + sum);
    }
}
