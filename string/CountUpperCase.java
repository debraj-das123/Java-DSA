package string;
import java.util.*;

public class CountUpperCase {
    public static int countUppercase(String str){

        int count = 0;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter ant string: ");

        String s = sc.nextLine();

        int result = countUppercase(s);

        System.out.println(" total no of upper case : " + result);

        sc.close();
    }
}
