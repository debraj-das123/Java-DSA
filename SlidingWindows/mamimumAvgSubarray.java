package SlidingWindows;

public class mamimumAvgSubarray {
    public static double avssubarray(int arr [], int k){
        int left =0; 
        int sum =0;
        
        int right =0;
        int maxsum = Integer.MIN_VALUE;
        while( right < arr.length){
            sum = sum + arr[right];

            if(right - left +1 == k){
                maxsum = Math.max(maxsum, sum);

                sum = sum - arr[left];
                left++;
            }

            right++;
        }

        return(double) maxsum/k;
    }

    public static void main(String[] args) {
        int arr [] = {1,12,-5,-6,50,3};

        double result = avssubarray(arr, 3);

        System.out.println(result);
    }
}
