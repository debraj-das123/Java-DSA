package Matrix;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int n = sc.nextInt();
        System.out.println("Enter the column");
        int m = sc.nextInt();
        int arr1[][] = new int[n][m];
        int arr2[][] = new int[n][m];
        int sum[][] = new int[n][m];

        System.out.println("Enter the arrays: ");
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the arrays: ");
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the arrays: ");
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
            
        }

        System.out.println("Enter the arrays: ");
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
