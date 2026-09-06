// check palindrome {1,2,3,2,1}
package arrays;

public class Palindrome {
  public static boolean ispalindrome(int arr[]){
    int start = 0;
    int end = arr.length-1;
    while (start < end) {
      if(arr[start] != arr[end]){
        return false;
      }
    }
    return true;
  }
  public static void main(String [] args){
    int arr []=  {1,2,3,5,6,7,8,9};
    ispalindrome(arr);
    if(ispalindrome(arr)){
      System.out.println("arr is palindrome");
    }
    else{
      System.out.println("not palindrom");
    }

  }
}
