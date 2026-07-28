package binarySearch;

public class searchRotatedSortedArrays {
    public static int search(int arr [], int target){
        int n = arr.length;
        int left =0;
        int right = n-1;
        
        while (left <= right) {

            int mid = left + (right - left)/2;

            if(target == arr[mid]){
                return mid;
            }

            // left array is sorted
            if(arr[left] <= arr[mid]){

                // tarfet is inside the left half
                if(arr[left] <= target && target < arr[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            // right part is sorted 
            else{

                // target is insid the right half
                if(arr[mid] < target && target <= arr[right]){
                    left = mid+1;
                }
                else{
                    right = mid -1;
                }

            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {3,4,5,6,7,0,1,2};

        int target = 0;

        System.out.println("index of arrays: " + search(arr, target));
    }
}
