package SessionThree;

public class GenerateAllPermutation {
    private static void generate(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char cc = input.charAt(i);
            generate(input.substring(0, i) + input.substring(i + 1), output + cc);
        }
    }

    public static void main(String[] args) {
        generate("abc", "");
    }
}
