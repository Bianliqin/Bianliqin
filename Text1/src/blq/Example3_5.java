package blq;

public class Example3_5 {
    public static void main(String args[]) {
        long sum = 0, a = 8, itme = a, n = 12, i = 1;
        for (i = 1; i <= n; i++) {
            sum = sum + itme;
            itme = itme * 10 + a;
        }
        System.out.println(sum);
    }
}
