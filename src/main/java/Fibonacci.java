import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    /* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, ...*/
    private static int fibonacci(int value){
        if(value <= 1){
            return value;
        } else {
            return fibonacci(value - 1) + fibonacci(value - 2);
        }
    }

    private static Map<Integer, Integer> memo = new HashMap<>();
    public static int fibonacciWithHasMap(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int result = fibonacciWithHasMap(n - 1) + fibonacciWithHasMap(n - 2);
            memo.put(n, result);
            return result;
        }
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int range = 10;
        for (int i = 0; i < range; i++){
            System.out.println("i = " + i);
            int fibonacci = fibonacciWithHasMap(i);
            stringBuilder.append(fibonacci).append(", ");
        }
        System.out.println("Result = " + stringBuilder);
    }



}
