import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MakingAnagrams {

    public static int makeAnagram(String a, String b) {

        List<String> aList = Arrays.asList(a.split(""));
        List<String> bList = Arrays.asList(b.split(""));
        List<String> temporaryA = new ArrayList<String>();
        List<String> temporaryB = new ArrayList<String>();

        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < bList.size(); j++){
                if(aList.get(i).equalsIgnoreCase(bList.get(j))){
                    temporaryA.add(aList.get(i));
                }
            }
        }

        for (int i = 0; i < bList.size(); i++) {
            for (int j = 0; j < aList.size(); j++){
                if(bList.get(i).equalsIgnoreCase(aList.get(j))){
                    temporaryB.add(bList.get(i));
                }
            }
        }

        if(temporaryA.size() == temporaryB.size()){
            int totalAnagram = temporaryA.size() + temporaryB.size();
            int totalSize = a.length() + b.length();
            return totalSize-totalAnagram;
        }

        return 0;
    }

    public static int makeAnagramV2(String a, String b){

        /*Tinggal Cari Cara Bagaimananya biar di gak double*/
        int totalLength = a.length() + b.length();
        String tempA = new String();
        String tempB = new String();
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        for (int i = 0; i < aChars.length; i++) {
            char character = aChars[i];
            if(b.contains(Character.toString(character))){
                    tempA += character;
            }
        }

        for (int i = 0; i < bChars.length; i++) {
            char character = bChars[i];
            if(a.contains(Character.toString(character))){
                    tempB += character;
            }
        }

        System.out.println("tempA = " + tempA +" Total length = " + tempA.length());
        System.out.println("tempB = " + tempB +" Total length = " + tempB.length());



        int anagramLength = tempA.length() + tempB.length();

        return totalLength - anagramLength;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = makeAnagramV2(a, b);

        bufferedReader.close();
    }

}
