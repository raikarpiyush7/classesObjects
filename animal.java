package classesObjects;

public class animal {
    String name;
    String bread;
    int age;

    void eat(){
        System.out.println("Animal is having its food");
    }

    public static void main(String[] args) {
        animal an=new animal();

        an.name="lab bog";
        an.bread="pet bog";
        an.age=2;

        an.eat();
    }
}
