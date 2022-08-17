package SessionFour;

public class LexicoCounting {
    private static void lexicoPrint(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.println(start);
        int callDigit = 0;
        if (start == 0) {
            callDigit = 1;
        }
        while (callDigit <= 9) {
            lexicoPrint(start * 10 + callDigit, end);
            callDigit++;
        }
    }

    public static void main(String[] args) {
        lexicoPrint(0, 100);
    }
}