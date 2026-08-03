package arrays.linearSearching;

public class LinearSearch {
  public static int serach(int arr [], int target){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == target){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr [] = {34,12,7,4,9,37};
    int target = 7;
    int result = serach(arr, target);
    if(result == -1){
      System.out.println("not foound");
    }
    else{
      System.out.println("found at index" + result);
    }
  }
}
