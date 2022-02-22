public class Permutations {
    public static void generatePermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String permu = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(permu, ans + ch);

        }

    }
