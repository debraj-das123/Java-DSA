package Sorting;

public class QuickSort {
    static void quickSort(int arr[] , int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);

            // left side
            quickSort(arr, low, pivotIndex-1);

            // right side
            quickSort(arr, pivotIndex+1, high);
        }
    }

    static int partition(int arr[], int low, int high){
        int pivot = arr[high];

        int i = low-1;
        int j = low;
        while (j < high) {

            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;

            
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
