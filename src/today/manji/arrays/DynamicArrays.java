package today.manji.arrays;

import java.util.ArrayList;

public class DynamicArrays {
    public static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(0);
        list.toArray();
        System.out.println(list);
    }
}
