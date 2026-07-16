package string;

public class Anagram {
    public static boolean isanagram(String s, String t){
        // step 1 check length od 2 arr eqq or not
        if(s.length() != t.length()){
            return false;
        }

        // step 2 Frequency arr
        int [] fre = new int[26];

        // step 3
        for(int i = 0; i<s.length(); i++){
            fre[s.charAt(i) - 'a']++;

            fre[t.charAt(i) - 'a']--;
        }

        for(int count : fre){
            if(count != 0){
                return false;
            }
        }


        // for (int i = 0; i < freq.length; i++) {

        //    if (freq[i] != 0) {
        //      return false;
        //    }
        // }

        return true;

    }

    public static void main(String[] args) {
        String s = "abs";
        String t = "sab";

        System.out.println(isanagram(s, t));
    }
}
