package string;

import java.util.Scanner;

public class RemoveSpace {
    public static String removeSpace(String str){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c != ' '){
                s.append(c);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String sb = sc.nextLine();

        System.out.println("resulting String : " + removeSpace(sb));

        sc.close();
    }
}
