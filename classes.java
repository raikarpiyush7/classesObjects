package classesObjects;

public class classes {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        classes obj = new classes();
        obj.name = "John";
        obj.age = 25;
        obj.display();
    }
}
