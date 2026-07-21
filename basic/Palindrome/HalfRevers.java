package basic.Palindrome;
// solve this problem using Half reverse 
// it is a best approch for interview
// T.C= o(log n)
// S.C = o(1)
public class HalfRevers {
    public static boolean ispalindrome(int x){
        if(x < 0 || (x%10 ==0 && x!=0)){
            return false;
        }

        int reverse = 0;
        while (x > reverse) {
            int digit = x%10;

            reverse = reverse*10 + digit;
            
            x = x/10;
        }
        return  x == reverse || x == reverse/10;
        

       
    }

    public static void main(String[] args) {
        int x = 1221;
        System.out.println(ispalindrome(x));
    }
    
}
