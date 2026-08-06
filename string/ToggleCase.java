package string;


public class ToggleCase {
    public static String togglecaase(String str){
        StringBuilder s = new StringBuilder();

        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'A' && ch<= 'Z'){                              
                s.append((char)(ch+32));
            }
            else if(ch >= 'a' && ch <= 'z'){
                s.append((char)(ch +32));
            }
            else{
                s.append(ch);
            }
               

            //             if (Character.isUpperCase(ch)) {
            //     sb.append(Character.toLowerCase(ch));
            // }
            // else if (Character.isLowerCase(ch)) {
            //     sb.append(Character.toUpperCase(ch));
            // }
            // else {
            //     sb.append(ch);
            // }

        






        }

        return s.toString();
    }

       public static void main(String[] args) {

        

        String str = "jFewFG123";

        System.out.println(togglecaase(str));

    }
    
}
