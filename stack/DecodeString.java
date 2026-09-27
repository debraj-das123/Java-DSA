package stack;
/*

  Input: s = "3[a]2[bc]"
   Output: "aaabcbc"

*/

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int number = 0;
        String current = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // 1. If character is a digit
            if (Character.isDigit(ch)) {

                number = number * 10 + (ch - '0');
            }

            // 2. Opening bracket
            else if (ch == '[') {

                // Save current state
                countStack.push(number);
                stringStack.push(current);

                // Start a new string
                number = 0;
                current = "";
            }

            // 3. Normal character
            else if (Character.isLetter(ch)) {

                current += ch;
            }

            // 4. Closing bracket
            else if (ch == ']') {

                // Get previous state
                int repeat = countStack.pop();
                String previous = stringStack.pop();

                // Repeat current string
                String temp = "";

                for (int j = 0; j < repeat; j++) {
                    temp += current;
                }

                // previous + repeated current
                current = previous + temp;
            }
        }

        return current;
    }

    public static void main(String[] args) {

        String s = "2[ab3[c2[d]]]";

        String result = decodeString(s);

        System.out.println("Input  : " + s);
        System.out.println("Output : " + result);
    }
}
