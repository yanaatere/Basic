package main.java;

import java.io.*;

/**
 * @author Yana Andika
 * on 7/4/2023
 */
public class WaysOfNumber {
    public static int ways(int total, int k) {
        int[] waysNumber = new int[total + 1];
        waysNumber[0] = 1;

        for (int i = 1; i < k + 1; i++) {
            for (int j = 1; j < total + 1; j++) {
                if(j>=i){
                    waysNumber[j] = waysNumber[j] + waysNumber[j-i];
                }
            }
        }

        System.out.println("Total Ways Of Number : " + waysNumber[total]);
        return waysNumber[total];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int total = Integer.parseInt(bufferedReader.readLine().trim());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = ways(total, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
