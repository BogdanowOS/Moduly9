public class MyQueue {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        Object value;
        Node next;
    }

    public void add(Object value) {
        Node newNode = new Node();
        newNode.value = value;
        if (last != null) {
            last.next = newNode;
        }
        last = newNode;
        if (first == null) {
            first = last;
        }
        size++;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (first == null) {
            return null;
        }
        return first.value;
    }

    public Object poll() {
        if (first == null) {
            return null;
        }
        Object value = first.value;
        first = first.next;
        size--;
        if (first == null) {
            last = null;
        }
        return value;
    }
}
