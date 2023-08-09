import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * @author Yana Andika
 * on 7/6/2023
 */
public class palindromTest {

    public boolean isPalindrom(String a){
        char[] chars =  a.toCharArray();
        int length = a.length();
        for (int i = 0; i < chars.length/2; i++) {
            if(chars[i] != chars[length -1]){
                return false;
            }
            length--;

        }
        return true;
    }

    @Test
    public void test(){
        Assertions.assertTrue(isPalindrom("ABA"));
    }
}
