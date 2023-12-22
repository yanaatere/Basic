/**
 * @author Yana Andika
 * on 5/28/2023
 */
public class FizzAndBuzz {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String name = "FizzAndBuzz";
        System.out.println("name = " + name);
        char[] chars = name.toCharArray();
        for (int i = chars.length - 1; i >= 0;  i--) {
            sb.append(chars[i]);
        }
        System.out.println(sb.toString());
        String s = reverseString(name);
        System.out.println(s);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
