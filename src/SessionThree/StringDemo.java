package SessionThree;

public class StringDemo {
    public static void main(String[] args) {
        String str = "coding";
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5));
        int ci = 3;

        System.out.println(str.substring(0, ci) + str.substring(ci + 1));
    }
}
