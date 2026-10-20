package Matrix;

import java.util.Scanner;

public class largestElement {
    public static int largestelement(int arr[][], int n, int m){
        int max = arr[0][0];
        for(int i =0 ;i <n; i++){
            for(int j =0; j <m; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int n = sc.nextInt();
        System.out.println("Enter column of array: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the array element : ");

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int result = largestelement(arr, n, m);
        System.out.println("sum of the all element of 2d array: " + result);
        sc.close();
    }
}
