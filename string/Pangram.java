package string;

import java.util.Scanner;

public class Pangram {
    public static boolean pangram(String sentence){

        boolean [] seen = new boolean[26];
        for(int i =0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            seen[ch -'a'] = true;

        }

        for(boolean present : seen){
            if(!present){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = sc.nextLine();

        System.out.println(pangram(s));
        sc.close();
    }
}
