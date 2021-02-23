package today.manji;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(0);
        list.removeLast();
        System.out.println(list.contains(20));
        System.out.println(list.size());
        System.out.println(list);
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
