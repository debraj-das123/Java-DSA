package string;
import java.util.*;

public class ReversString {
    public static String reverseString(String str){
        char [] arr = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {

            char temp  = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left ++;
            right --;
        }
        return new String(arr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter AS String");
        String a = sc.nextLine();

        String result = reverseString(a);
        System.out.println("Reverse String:" + result);

        sc.close();
    }
}
