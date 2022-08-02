package SessionTwo;

public class AllOccurence {
    private static int[] solution(int[] arr, int curr, int n, int search, int count) {
        if (curr == n) {
            return new int[count];
        }
        if (arr[curr] == search) {
            int[] recArray = solution(arr, curr + 1, n, search, count + 1);
            recArray[count] = curr;
            return recArray;
        } else {
            return solution(arr, curr + 1, n, search, count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 5, 2};
        int n = 6;
        int[] ans = solution(arr, 0, n, 2, 0);
        for (int indices : ans) {
            System.out.println(indices);
        }
    }
}