import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author Yana Andika
 * on 7/6/2023
 */
class StringCheckParashentesisTest {
    public boolean checkParanshetesisUsingStack(String s) {
        char[] character = s.toCharArray();
        Stack<Character> cs = new Stack<>();
        for (char c : character) {
            if (character.length <= 1) {
                return false;
            }

            switch (c) {
                case '{':
                case '[':
                case '(':
                    cs.push(c);
                    break;
                default:
                    if(cs.isEmpty()){
                        return false;
                    }
                    if ((c == '}' && cs.peek() == '{') || (c == ']' && cs.peek() == '[') || (c == ')' && cs.peek() == '(')){
                        cs.pop();
                    } else {
                        cs.push(c);
                    }
                    break;
            }
        }
        return cs.isEmpty();
    }

    @Test
    void testing(){
        String a = "(])";
        Assertions.assertTrue(checkParanshetesisUsingStack(a));
        //Assertions.assertTrue(checkParanshetesis(a));
    }
}