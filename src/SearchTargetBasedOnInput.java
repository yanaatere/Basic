import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author Yana Andika
 * on 7/6/2023
 */
public class SearchTargetBasedOnInput {

    public int resolve(int target, int[] totalData){

        HashMap<Integer, String> temporary = new HashMap<>();
        int sequence = 0;
        for (int i = 0; i < totalData.length; i++) {
            int data = totalData[i];
            if(temporary.containsKey(data)){
                sequence++;
            }
            int tampungan = target - data;
            temporary.put(tampungan,String.valueOf(data));
        }
        return sequence;
    }

    @Test
    public void test(){
        int[] numbers = {9,6,7,8,5,10};
        int resolve = resolve(15, numbers);
        Assertions.assertEquals(3, resolve);

    }
}
