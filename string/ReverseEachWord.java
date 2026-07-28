package string;
import java.util.*;

public class ReverseEachWord {
    public static String reversWord(String str){
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch != ' '){
                word.append(ch);
            }
            else{
                result.append(word.reverse());
                result.append(' ');

                word.setLength(0);
            }


        }

        result.append(word.reverse());
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an String :");

        String s = sc.nextLine();

        String re = reversWord(s);

        System.out.println(re);

        sc.close();
    }
}
