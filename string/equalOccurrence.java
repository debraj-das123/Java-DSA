package string;

public class equalOccurrence {

    public static boolean areOccurrencesEqual(String s) {

        int[] freq = new int[128];

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Find first non-zero frequency
        int count = 0;

        for (int i = 0; i < 128; i++) {
            if (freq[i] != 0) {
                count = freq[i];
                break;
            }
        }

        // Check all frequencies
        for (int i = 0; i < 128; i++) {

            if (freq[i] != 0 && freq[i] != count) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "aabbcc";

        boolean result = areOccurrencesEqual(s);

        System.out.println(result);
    }
}