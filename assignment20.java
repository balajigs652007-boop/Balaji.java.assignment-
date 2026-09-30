import java.util.ArrayList;

class TodoList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Complete Java assignment");
        tasks.add("Study for exam");
        tasks.add("Go to college");
        tasks.add("Complete project");

        System.out.println("To-Do List:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Removing a task
        tasks.remove("Go to college");

        System.out.println("\nAfter removing a task:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
