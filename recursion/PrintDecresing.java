package recursion;
import java.util.*;

public class PrintDecresing {
  static void print(int n){  // n, n-1, n-2,  , , , , ,  2, 1
    // base case
    if( n == 1){
      System.out.println(1);
      return;
    }

    // self work
    System.out.println(n);
    // recursion work
    print(n-1);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the any no :");
    int n = sc.nextInt();

    print(n);

    
  }
}
