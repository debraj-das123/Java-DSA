package string;


import java.util.HashSet;

// largest subString without repeating char
// solve this problem using hasMap and Sliding windows approch
// T.C = o(n)

public class LargestSubString {
    public static int lergestSubstringfind(String s){

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxlength = 0;
        for(int right =0; right< s.length(); right++){
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
                
            }
            set.add(s.charAt(right));

            maxlength = Math.max(maxlength, right-left+1);

        }

        return maxlength;
    }
    
}
