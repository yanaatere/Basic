import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = rotateLeft(a, d);

        /*bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );*/

        bufferedReader.close();
        //bufferedWriter.close();
    }

    public static List<Integer> rotateLeft(List<Integer> a, int d) {
        List<Integer> b = Arrays.asList(new Integer[a.size()]);
        for (int i = 0; i < a.size(); i++) {
            int rotatedIndex = (i + (a.size() - d)) % a.size();
            System.out.println("Rotate Index : " + rotatedIndex);
            System.out.println("Data : " + a.get(i));
            b.set(rotatedIndex, a.get(i));
        }
        return b;
    }

}
