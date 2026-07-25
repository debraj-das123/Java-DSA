package string;
// String arr = [ "flower" , "flow", "flinght"]

// ans = fl
public class LargestCommonPrefix {
    public static String largestCommonPrefix(String [] arr){
        String prefix = arr[0];

        for(int i = 1; i < arr.length; i++){
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return " ";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String str [] = {"flower", "flow", "flight"};

        String result = largestCommonPrefix(str);

        System.out.println("largest common prefic: " + result);
    }
}
