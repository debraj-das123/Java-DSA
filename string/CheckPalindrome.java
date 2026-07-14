package string;
import java.util.*;

public class CheckPalindrome {
    public static boolean ispalindrome(String str){
        int left = 0;
        int right = str.length() -1;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String a = sc.nextLine();

        if(ispalindrome(a)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Plaindrome");
        }
        sc.close();

    }
    
    
}
