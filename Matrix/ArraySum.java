package Matrix;

import java.util.Scanner;

public class ArraySum {
    public static int sum(int arr[][], int n, int m){
        int sum =0;
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the array element : ");

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int result = sum(arr, n, m);
        System.out.println("sum of the all element of 2d array: " + result);
        sc.close();
    }
}
