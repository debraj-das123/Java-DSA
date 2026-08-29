package recursion;
import java.util.*;

public class sumOfdigits {
    public static int SOD(int n){
        // base case
        if(n >= 0 && n <= 9){
            return n;
        }

        // sub problem
        int smallAns = SOD(n/10);

        // self work

        int ans = smallAns + n%10;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of all digits of this number: " + SOD(n));

        sc.close();
    }
}
