package arrays.linearSearching;

public class LinearSearching2 {
    public static int serach(int [] arr, int target){
        boolean found = false;
        int n = arr.length;
        int index = -1;
        for(int i= 0; i<n; i++){
            if(arr[i] == target){
                found = true;
                index = i;
                break;
            }
        }

        if(found){
            return index;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {12,56,3,56,2,6,33,5};
        int targer = 2;

        System.out.println("index of target: " + serach(arr, targer));
    }
}
