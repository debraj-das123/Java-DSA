package recursion;
import java.util.*;

public class factorial {
    public static int fac(int n){
        // base condition
        if(n == 0){
            return 1;
        }

        // sub problem
        int smallAns = fac(n-1);

        // self work
        int ans = n* smallAns;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a any number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of this number: " + fac(n));

        sc.close();
    }
}
