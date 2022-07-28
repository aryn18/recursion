package SessionOne;

public class FactPush {
    private static void factorial(int n, int ans) {
        if (n == 0 || n == 1) {
            System.out.println(ans);
            return;
        }
        factorial(n - 1, n * ans);
    }

    public static void main(String[] args) {
        factorial(5, 1);
    }
}