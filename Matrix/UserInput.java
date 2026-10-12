package Matrix;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = sc.nextInt(); // row

        System.out.println("Enter the number of cloumn");
        int m = sc.nextInt(); // column

        int arr [][] = new int[n][m];
        System.out.println("enter the number of array element");
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2d array is : ");
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
