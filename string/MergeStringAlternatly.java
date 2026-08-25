package string;

public class MergeStringAlternatly {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder s = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                s.append(word1.charAt(i));
                i++;
            }

            if (j < word2.length()) {
                s.append(word2.charAt(j));
                j++;
            }
        }

        return s.toString();
    }

    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqrs";

        String result = mergeAlternately(word1, word2);

        System.out.println(result);
    }
}