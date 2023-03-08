import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> stack;

    public MyStack() {
        stack = new ArrayList<Object>();
    }

    public void push(Object value) {
        stack.add(value);
    }

    public void remove(int index) {
        stack.remove(index);
    }

    public void clear() {
        stack.clear();
    }

    public int size() {
        return stack.size();
    }

    public Object peek() {
        return stack.get(size() - 1);
    }

    public Object pop() {
        Object obj = peek();
        remove(size() - 1);
        return obj;
    }
}
