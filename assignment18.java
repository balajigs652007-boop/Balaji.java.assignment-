class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Rahul", 85);
        Student student2 = new Student("Priya", 92);

        System.out.println("Student 1:");
        student1.display();

        System.out.println();

        System.out.println("Student 2:");
        student2.display();
    }
}
