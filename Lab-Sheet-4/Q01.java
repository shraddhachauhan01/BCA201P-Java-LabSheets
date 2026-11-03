import java.util.Scanner;

class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        String details = "Name: " + name + ", Age: " + age;
        System.out.println(details);
    }
}

public class Q01 {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 20);
        Student s2 = new Student("Riya", 19);
        s1.display();
        s2.display();
        System.out.println("Total students: " + Student.count);
    }
}
