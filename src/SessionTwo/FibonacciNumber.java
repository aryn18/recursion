package SessionTwo;

public class FibonacciNumber {
    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int c1 = fibonacci(n - 1);
        int c2 = fibonacci(n - 2);

        return c1 + c2;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
