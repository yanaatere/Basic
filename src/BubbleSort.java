import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Yana Andika
 * on 5/24/2023
 */
public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(bufferedReader.readLine().trim());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = ways(total, k);

        bufferedReader.close();
    }

    public static int ways(int total, int k) {
        int[] numbers = new int[k];
        for (int i = 0; i < k; i++) {
            numbers[i] = k;
            System.out.println(k);
        }

        int[] temporary = new int[total + 1];
        temporary[0] = 1 ;

        for (int number : numbers) {
            for (int i = 0; i < total; i++) {
                temporary[i] += temporary[i-number];
            }
        }

        System.out.println("Total " + temporary[total]);
        return temporary[total];
    }
}
