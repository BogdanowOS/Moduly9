public class MyArrayList<T> {
    private T[] data;
    private int size;

    public MyArrayList() {
        data = (T[]) new Object[10];
        size = 0;
    }

    public void add(T value) {
        if (size == data.length) {
            // якщо масив заповнений, збільшуємо його розмір удвічі
            T[] newData = (T[]) new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        data[size++] = value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        data[size] = null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }
}