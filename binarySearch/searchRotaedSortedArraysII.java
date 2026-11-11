package binarySearch;

public class searchRotaedSortedArraysII {
    public static boolean ans(int arr[], int target){
        int n=arr.length;
        int l  = 0;
        int r = n-1;
        while (l <= r) {
            int m = l + (r-l)/2;

            if(arr[m] == target){
                return true;
            }
            if (arr[l] == arr[m] && arr[m] == arr[r]) {
                l++;
                r--;
                
            }
            else if (arr[l] <= arr[m]) {

                if(arr[l] <= target && target < arr[m] ){
                    r  =m-1;
                }
                else{
                    l = m+1;
                }
                
            }
            else{
                if(arr[l] < target && target <= arr[r]){
                    l=m+1;
                }
                else{
                    r=m-1;
                }
            }
            
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,0,0,1,2};
        int t = 0;

        System.out.println(ans(arr, t));
    }
}
