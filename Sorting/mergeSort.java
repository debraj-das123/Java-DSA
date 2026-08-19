package Sorting;

public class mergeSort {

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        Solution s = new Solution();

        s.meresort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

class Solution {

    public void meresort(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        // Divide
        meresort(arr, start, mid);
        meresort(arr, mid + 1, end);

        // Merge
        merge(arr, start, mid, end);
    }

    public void merge(int arr[], int start, int mid, int end) {

        int temp[] = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        // Compare two sorted parts
        while (i <= mid && j <= end) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left part
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        // Remaining elements from right part
        while (j <= end) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        // Copy temp to original array
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }
}