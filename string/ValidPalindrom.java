package string;
// string = { "A man, a plan, a canal: Panama"}

// output = amanaplanacanalpanama  
// true
public class ValidPalindrom {
    public static boolean ispalindrome(String s){
        int left = 0;
        int right = s.length()- 1;

        while (left <right) {

            if(!Character.isLetterOrDigit(left)){
                left++;
            }
            else if(!Character.isLetterOrDigit(right)){
                right--;
            }

            else{
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }

                left++;
                right--;
            }

           
            
            
        }

        return true;


    }

    public static void main(String[] args) {
        String t ="A man, a plan, a canal: Panama";

        System.out.println(ispalindrome(t));
    }
}
