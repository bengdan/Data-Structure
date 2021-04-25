package today.manji.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private List leftBrackets = Arrays.asList('(', '[');
    private List rightBrackets = Arrays.asList(')', ']');

    public boolean isBalanced(String input) {
        var stack = new Stack<Character>();

        for (char c :
                input.toCharArray()) {

            if (leftBrackets.contains(c)) {
                stack.push(c);
            }

            if (rightBrackets.contains(c)) {
                if (stack.isEmpty()) return false;

                if (leftBrackets.indexOf(stack.peek()) == rightBrackets.indexOf(c))
                    stack.pop();
                else
                    return false;
            }

        }

        return stack.isEmpty();
    }
}
