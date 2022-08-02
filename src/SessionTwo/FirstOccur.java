package SessionTwo;

public class FirstOccur {
    private static int solution(int[] arr, int curr, int n, int search) {
        if (curr == n) {
            return -1;
        }
        if (arr[curr] == search) {
            return curr;
        }
        return solution(arr, curr + 1, n, search);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 5};
        int n = 5;
        System.out.println(solution(arr, 0, n, 2));
    }
}
