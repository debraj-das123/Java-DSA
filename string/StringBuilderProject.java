package string;
// practice all methode of String Builder 
public class StringBuilderProject {

    public static void main(String[] args) {

        // Step 1
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Initial : " + sb);

        // Step 2 : append()
        sb.append(" Spring");
        System.out.println("Append : " + sb);

        // Step 3 : insert()
        sb.insert(5, "Boot ");
        System.out.println("Insert : " + sb);

        // Step 4 : replace()
        sb.replace(5, 10, "DSA");
        System.out.println("Replace : " + sb);

        // Step 5 : delete()
        sb.delete(9, 16);
        System.out.println("Delete : " + sb);

        // Step 6 : setCharAt()
        sb.setCharAt(0, 'j');
        System.out.println("setCharAt : " + sb);

        // Step 7 : reverse()
        sb.reverse();
        System.out.println("Reverse : " + sb);

        // Step 8 : charAt()
        System.out.println("Character at index 2 : " + sb.charAt(2));

        // Step 9 : length()
        System.out.println("Length : " + sb.length());

        // Step 10 : toString()
        String str = sb.toString();
        System.out.println("String : " + str);
    }
}