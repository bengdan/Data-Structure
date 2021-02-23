package today.manji.linkedList;

public class LinkedList {
    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first  = last =  node;
        }
        else {
            last.next = node;
            last = node;
        }
    }
}

