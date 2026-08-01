package binarySearch;

import java.util.Scanner;

public class searchInsertPosition {
    public static int search(int arr[], int target){
        int start = 0;
        int n = arr.length;
        int end = n-1;
        boolean found = false;
        int index =-1;

        while (start <= end) {
            int mid = start + (end -start)/2;

            if(arr[mid] == target){

                found = true;
                index = mid;
                break;

            }
            else if(arr[mid] < target){
                start = mid +1;

            }
            else{
                end = mid-1;
            }
            
        }

        if(found){
            return index;
        }
        return start;
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter arrays element: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        System.out.println("Index of target position = " + search(arr, target));

        sc.close();
        

    }
}
