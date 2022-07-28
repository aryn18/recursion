package SessionOne;

public class ReverseOne {

    // push or build
    private static void reverse(int[] arr, int curr) {
        if (curr == -1) {
            return;
        }
        System.out.println(arr[curr]);
        reverse(arr, curr - 1); // tail recusrion
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9};
        int curr = 3;
        reverse(arr, curr);
    }
}
