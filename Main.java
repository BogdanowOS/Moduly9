public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("Size of list: " + myList.size()); // повинно вивести Size of list: 3
        System.out.println("Element at index 1: " + myList.get(1)); // повинно вивести Element at index 1: 2
        myList.remove(1);
        System.out.println("Size of list after removal: " + myList.size()); // повинно вивести Size of list after removal: 2
        myList.clear();
        System.out.println("Size of list after clear: " + myList.size()); // повинно вивести Size of list after clear: 0
    }
}