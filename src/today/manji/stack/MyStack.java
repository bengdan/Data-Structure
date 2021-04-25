package today.manji.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStack {
    private List valueList = new ArrayList<Integer>();

    public boolean isEmpty() {
        return valueList.isEmpty();
    }

    public void push(int value) {
        valueList.add(value);
    }

    public int pop() {
        if (isEmpty()) throw new  IllegalStateException();
        int lastIndex = valueList.size() - 1;
        int lastValue = (int) valueList.get(lastIndex);
        valueList.remove(lastIndex);
        return lastValue;
    }

    public int peek() {
        if (isEmpty()) throw new  IllegalStateException();
        int lastIndex = valueList.size() - 1;
        return (int) valueList.get(lastIndex);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "valueList=" + valueList +
                '}';
    }
}
