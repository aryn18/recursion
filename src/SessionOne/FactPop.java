package SessionOne;

public class FactPop {
    public static int factorial(int n) {
        if (n == 0 || n == 1) { //base case
            return 1;
        }
        int recAns = factorial(n - 1); // recursive call
        return recAns * n;

//        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
