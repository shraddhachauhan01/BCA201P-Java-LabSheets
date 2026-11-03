class Person {
    String name;
    int age;
    static String country = "India";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkVoting() {
        boolean eligible = age >= 18;
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}

public class Q14 {
    public static void main(String[] args) {
        Person p = new Person("Aman", 19);
        p.checkVoting();
    }
}
