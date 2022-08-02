package SessionTwo;

public class BoardPath {
    private static int boardPath(int curr, int dest) {

        if (curr == dest) {
            return 1;
        }
        if (curr > dest) {
            return 0;
        }
        int c1 = boardPath(curr + 1, dest);
        int c2 = boardPath(curr + 2, dest);
        int c3 = boardPath(curr + 3, dest);
        int c4 = boardPath(curr + 4, dest);
        int c5 = boardPath(curr + 5, dest);
        int c6 = boardPath(curr + 6, dest);
        return c1 + c2 + c3 + c4 + c5 + c6;
    }

    public static void main(String[] args) {
        System.out.println(boardPath(0, 10));
    }
}
