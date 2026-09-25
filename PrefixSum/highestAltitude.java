package PrefixSum;

public class highestAltitude {
    public static int largestAltitude(int arr[]){
        int altitude =0;
        int max  = 0;
        for(int i =0; i<arr.length; i++){
           altitude = altitude + arr[i];

           max = Math.max(max, altitude);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr [] = {-5,1,5,0,-7};
        int result = largestAltitude(arr);
        System.out.println(result);
    }
}
