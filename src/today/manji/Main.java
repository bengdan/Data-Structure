package today.manji;

import today.manji.linkedList.LinkedList;
import today.manji.stack.Expression;
import today.manji.stack.MyStack;

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

        System.out.println("------My Stack--------");

        var myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack);


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
