package SessionFour;

public class GenerateParenthesis {
    private static void genParenthesis(String ans, int open, int close, int n) {
        if (open == n && close == n) {
            System.out.println(ans);
            return;
        }

        if (open < n) {
            genParenthesis(ans + '(', open + 1, close, n);
        }
        if (open > close) {
            genParenthesis(ans + ')', open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        genParenthesis("", 0, 0, 2);
    }
}