package today.manji;

import today.manji.linkedList.LinkedList;
import today.manji.stack.Expression;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println("------Reverse String--------");

        System.out.println(reverseString("Manji"));

        System.out.println("------Balanced Expression--------");

        var expression = new Expression();

        System.out.println(expression.isBalanced("[452]"));


    }

    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        var stack = new Stack<Character>();
        for (char c:
        str.toCharArray())
            stack.push(c);

        StringBuffer output = new StringBuffer();
        while (!stack.isEmpty()) output.append(stack.pop());
        return output.toString();
    }
}
