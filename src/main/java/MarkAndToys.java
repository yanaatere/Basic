import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MarkAndToys {

    /*Input
    * 7 50
    * 1 12 5 111 200 1000 10
    * Output
    * 4
    * */
    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);
        int totalToys = 0;
        int totalToy = 0;
        for (int i = 0; i < prices.size(); i++) {
            totalToys += prices.get(i);
            if(totalToys > k) break;
            totalToy++;
        }
        System.out.println(totalToy);
        return totalToy;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> prices = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = maximumToys(prices, k);
        System.out.println("result = " + result);

        bufferedReader.close();
    }
}
