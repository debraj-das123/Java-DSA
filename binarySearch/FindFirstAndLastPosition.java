package binarySearch;


import java.util.Arrays;

public class FindFirstAndLastPosition {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    // Find the first occurrence of the target
    public static int findFirst(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } 
            else if (nums[mid] > target) {
                end = mid - 1;
            } 
            else {
                ans = mid;      // Store current answer
                end = mid - 1;  // Search left for an earlier occurrence
            }
        }

        return ans;
    }

    // Find the last occurrence of the target
    public static int findLast(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } 
            else if (nums[mid] > target) {
                end = mid - 1;
            } 
            else {
                ans = mid;        // Store current answer
                start = mid + 1;  // Search right for a later occurrence
            }
        }

        return ans;
    }
}