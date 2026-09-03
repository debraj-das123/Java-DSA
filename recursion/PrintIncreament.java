package recursion;
import java.util.Scanner;


public class PrintIncreament {
  static void print(int n){
    //base case
    if(n == 1){
      System.out.println(1);
      return;
    }

    // recursion work
    print(n-1);
    System.out.println(n);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the any no:");
    int n = sc.nextInt();
    
    print(n);
    sc.close();

  }

  
}
