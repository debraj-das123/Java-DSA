package string;
// maximum word ina string array

public class MaximumWord {
    public static int maximumword(String [] sentences){
        int max= 0; 

        for(String sentence: sentences){
            int count =0;

            for(int i =0; i<sentence.length(); i++){
                if(sentence.charAt(i) == ' '){
                    count++;
                }
            }

            if(count> max){
                max = count;
            }
        }

        return max+1;
    }

    public static void main(String[] args) {
        String [] sentences = {"i love you","my name is debraj das","i live in jaipur"};

        System.out.println(maximumword(sentences));
    }
}
