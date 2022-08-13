package SessionThree;

public class GenerateAllSubsequences {
    private static void generate(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        char cc = input.charAt(0);
        generate(input.substring(1), output);
        generate(input.substring(1), output + cc);
    }

    public static void main(String[] args) {
        generate("abc", "");
    }
}
