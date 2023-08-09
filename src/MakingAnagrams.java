import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakingAnagrams {

    public static int makeAnagramV2(String a, String b) {

        int[] counts = new int[26]; //Because This Is Of
        char[] firstChars = a.toCharArray();
        char[] secondChars = b.toCharArray();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            int firstIndex = firstChars[i] - 'a';
            counts[firstIndex] =+ 1;
        }

        for (int j = 0; j < b.length(); j++) {
            int secondIndex = secondChars[j] - 'a';
            counts[secondIndex] =- 1;
        }

        for (int k = 0; k < counts.length; k++) {
            sum += Math.abs(counts[k]);
        }

        return sum;
    }


    public int minSteps(String s, String t) {
        final int a = 97; //ASCII OF 'a'
        final int size = 26; //size of array
        int[] arr = new int[size];
        int l = s.length();
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        for (int i = 0; i < l; i++) {
            int sci = sa[i] - a;
            int tci = ta[i] - a;
            arr[sci] += 1;
            arr[tci] -= 1;
        }
        int ans = 0;
        for (int n : arr) {
            if (n > 0) {
                ans += n;
            }
        }
        return ans;
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
