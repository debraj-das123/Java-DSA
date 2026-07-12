package string;
import java.util.*;

public class CountDigits {
    public static int countDigits(String str){
        int count = 0;

        for(int i = 0; i< str.length(); i++){
            char c=  str.charAt(i);

            if(c >= '0' && c <= '9'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.nextLine();

        int result = countDigits(s);
        System.out.println("total no of digits of this String :" + result);

        sc.close();

    }
}
