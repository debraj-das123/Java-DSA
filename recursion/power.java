package recursion;
import java.util.*;

// give two no p & q find the valu of p^q using recursion 
public class power {
    public static int pow(int p, int q){  // where q is squre

        // base case
        if( q ==0){
            return 1;
        }

        // sub problem 
        int smallAns = pow(p, q-1);
        
        // self work
        int ans = smallAns * p;

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int p = sc.nextInt();

        System.out.println("Enter the power : ");
        int q = sc.nextInt();

        System.out.println("Ans : " + pow(p, q));

        sc.close();
    }
}
