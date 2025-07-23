
public class Student {

    String name;
    int age;

    // Default constructor
    public Student() {
        this("Unknown", 0); // Calls the two-parameter constructor
        System.out.println("No-argument constructor called.");
    }

    // Constructor with one parameter
    public Student(String name) {
        this(name, 18); // Calls the two-parameter constructor
        System.out.println("One-argument constructor called.");
    }

    // Constructor with two parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two-argument constructor called.");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Calls no-argument constructor
        Student s2 = new Student("Alice"); // Calls one-argument constructor
        Student s3 = new Student("Bob", 20); // Calls two-argument constructor

        s1.display();
        s2.display();
        s3.display();
    }
}
