package recursion;
import java.util.*;

public class fibonacci {
    public static int f(int n){

        // base condition
        if(n == 0 || n == 1){
            return n;
        }

        // sub problem
        int prev = f(n-1);
        int prevprev = f(n-2);

        int ans = prev + prevprev;

        return ans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
                    System.out.print(f(i)+ " ");

        }
        sc.close();
    }
}
