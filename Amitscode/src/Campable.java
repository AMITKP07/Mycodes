import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implement compareTo to sort by name (natural order)
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}

public class Campable {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 23));
        students.add(new Student("Zob", 21));
        students.add(new Student("Charlie", 25));

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort using Comparable
        Collections.sort(students);

        System.out.println("\nAfter sorting by name (using Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
