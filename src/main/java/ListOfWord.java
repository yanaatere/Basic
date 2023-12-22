import java.util.*;

class ListofWord {

    public static String ArrayChallenge(String[] strArr) {
        String sequence = strArr[0];
        List<String> listOfWord = Arrays.asList(strArr[1].split(","));

        for (int i = 1; i < sequence.length(); i++) {
            String firstWord = sequence.substring(i);
            String secondWord = sequence.substring(0, i);


            if (listOfWord.contains(firstWord) && listOfWord.contains(secondWord)) {
                return reverseString(firstWord, secondWord);
            }

        }

        return strArr[0];
    }

    private static String reverseString(String str1, String str2) {
        String token = "35tykpwvbc";
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        return reversedStr1 + "," + reversedStr2 + ":" + token;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayChallenge(new String[]{"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}));
    }

}
