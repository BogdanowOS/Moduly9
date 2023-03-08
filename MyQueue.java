import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> items;

    public MyQueue() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public void clear() {
        items.clear();
    }

    public int size() {
        return items.size();
    }

    public T peek() {
        if (size() == 0) {
            return null;
        }
        return items.get(0);
    }

    public T poll() {
        if (size() == 0) {
            return null;
        }
        T item = items.get(0);
        items.remove(0);
        return item;
    }
}
