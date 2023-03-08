public class Main {

    public static void main(String[] args) {

        // Завдання 1 - виведення простих чисел
        System.out.println("Завдання 1 - виведення простих чисел");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Завдання 2 - LinkedList
        System.out.println("Завдання 2 - LinkedList");
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Розмір списку: " + list.size());
        System.out.println("Елемент з індексом 1: " + list.get(1));
        list.remove(1);
        System.out.println("Розмір списку після видалення елемента з індексом 1: " + list.size());

        // Завдання 3 - Queue
        System.out.println("Завдання 3 - Queue");
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Розмір черги: " + queue.size());
        System.out.println("Перший елемент черги: " + queue.peek());
        System.out.println("Видалений елемент черги: " + queue.poll());
        System.out.println("Розмір черги після видалення елемента: " + queue.size());

        // Завдання 4 - Stack
        System.out.println("Завдання 4 - Stack");
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Розмір стеку: " + stack.size());
        System.out.println("Перший елемент стеку: " + stack.peek());
        System.out.println("Видалений елемент стеку: " + stack.pop());
        System.out.println("Розмір стеку після видалення елемента: " + stack.size());

        // Завдання 5 - HashMap
        System.out.println("Завдання 5 - HashMap");
        MyHashMap map = new MyHashMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        System.out.println("Розмір мапи: " + map.size());
        System.out.println("Значення для ключа key2: " + map.get("key2"));
        map.remove("key3");
        System.out.println("Розмір мапи після видалення елемента: " + map.size());
    }

    private static boolean isPrime(int i) {
        return false;
    }
}

