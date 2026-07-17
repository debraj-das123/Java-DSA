// find mejority element 
// return this element who appear more then n/2 time
package arrays;

public class MejorityElement {
  public static int mejority(int arr[]){
    int count =0;
    int n = arr.length;
    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        if(arr[i] == arr[j]){
          count++;
        }

      }
      if(count > n/2){
        return arr[i];
      }
    }
    
    return -1;
  }

  public static void main(String[] args) {
    int arr [] = {2,2,2,5,4,2,11,11,11};
    int result = mejority(arr);
    System.out.println("mejority element" + result);
  }
}
