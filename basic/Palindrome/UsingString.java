package basic.Palindrome;
// check palindrome x = 121
// ans true    solve this question string approch 

// T.C = o(n)
// S.C = o(1)

public class UsingString {
    public static boolean ispalindrome(int x){
        if(x <0){
            return false;
        }
        String str = String.valueOf(x);

        int left = 0;
        int right = str.length()-1;
        while (left < right) {

            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 121;

        System.out.println(ispalindrome(x));
    }
}
