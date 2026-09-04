package SlidingWindows;
// number of sub arrays of size k and avg greater then or equal to threshold'
/*
    Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages
 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages
  less than 4 (the threshold)

*/
public class avgGetter {
    public static int greaterAvgsubarray(int arr[] , int k, int threshold){
        int left =0;
        int right = 0;
        int sum =0;
        int count =0;
        

        while(right < arr.length){
            sum += arr[right];

            if(right - left +1 <k){
                right++;
            }

            else if(right -left +1 == k){
                if(sum >= threshold*k){
                    count++;
                }

                sum -= arr[left];

                left++;
                right++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr []= {2,2,2,2,5,5,5,4};
        int k = 3;
        int threshold = 4;

        System.out.println("total number of sub array: " +greaterAvgsubarray(arr, k, threshold));
    }
}
