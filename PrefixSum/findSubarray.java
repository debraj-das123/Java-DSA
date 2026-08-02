package PrefixSum;

import java.util.Scanner;

public class findSubarray {
    public static void printsubarrays(int arr[], int k){
        int n = arr.length;

        for(int i= 0; i<= n-k; i++){
            for(int j = i; j<i+k; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the arrays element : ");
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the size of subarrays : ");
        int k = sc.nextInt();

        printsubarrays(arr, k);

        sc.close();
    }
}
