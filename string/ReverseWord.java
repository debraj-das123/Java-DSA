package string;

// Reverse a word  using String Builder
// input = i love java
// outputb = java love i
// TC = o(n)
// SC = o(1)
public class ReverseWord {
    public static String reverseWord(String str){
        String [] word = str.split(" ");
        StringBuilder s = new StringBuilder();
        for(int i = word.length -1; i >= 0; i--){
            s.append(word[i]);

            if(i != 0){
                s.append(" ");

            }

        }
        return s.toString();
    }

    public static void main(String[] args) {
        String sb = "i love java";

        System.out.println("result : " + reverseWord(sb));
    }
}
