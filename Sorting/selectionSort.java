package Sorting;

public class selectionSort {
    public static void selectionsort(int arr[]){
        int n = arr.length;
        for(int i= 0; i<n-1; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < min){
                    min =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int k [] = {5,1,2,9,12,87};
        selectionsort(k);
        System.out.println("sorted array: ");
        for(int num :k){
            System.out.print(num + " ");
        }
    }
}
