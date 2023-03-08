public class Main {
    public static void main(String[] args) {
        // Завдання 1 - MyArrayList
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        System.out.println("MyArrayList: " + myArrayList);
        myArrayList.remove(1);
        System.out.println("MyArrayList after removing element at index 1: " + myArrayList);
        myArrayList.clear();
        System.out.println("MyArrayList after clear: " + myArrayList);

        // Завдання 2 - MyLinkedList
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("John");
        myLinkedList.add("Jane");
        myLinkedList.add("Jack");
        System.out.println("MyLinkedList: " + myLinkedList);
        myLinkedList.remove(1);
        System.out.println("MyLinkedList after removing element at index 1: " + myLinkedList);
        myLinkedList.clear();
        System.out.println("MyLinkedList after clear: " + myLinkedList);

        // Завдання 3 - MyQueue
        MyQueue<Double> myQueue = new MyQueue<>();
        myQueue.add(3.14);
        myQueue.add(2.71);
        System.out.println("MyQueue: " + myQueue);
        System.out.println("Peek the first element in MyQueue: " + myQueue.peek());
        System.out.println("Poll the first element from MyQueue: " + myQueue.poll());
        System.out.println("MyQueue after poll: " + myQueue);
    }
}
