package SessionOne;

public class ReverseTwo {

    // pop or broke
    private static void reverse(int[] arr, int curr, int n) {
        if (curr == n) {
            return;
        }
        reverse(arr, curr + 1, n); //head recursion
        System.out.println(arr[curr]);
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9};
        int curr = 0;
        reverse(arr, curr, arr.length);
    }
}
