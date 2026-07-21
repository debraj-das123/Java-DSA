package basic.Palindrome;
// solve this problem using math
// T.C = n(logn)
// S.C = n(1)

public class UsingMath {
    public static boolean isplaindrome(int x){
        if(x <0){
            return false;
        }
        int original =x;
        int reverse = 0;
        while (x != 0) {
            int digit = x%10;
            reverse = reverse*10+digit;

            x = x/10;
        }
         
        return original == reverse;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isplaindrome(x));
    }
}
