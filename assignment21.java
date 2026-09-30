import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("LinkedList: " + list);

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.removeFirst();
        list.removeLast();

        System.out.println("After removing first and last:");
        System.out.println(list);

        // Removing an element by value
        list.remove("Mango");

        System.out.println("After removing Mango:");
        System.out.println(list);
    }
}
