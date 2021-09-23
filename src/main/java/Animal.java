public class Animal {
    protected String name;
    protected String color;
    protected int age;
    static int count = 0;

    Animal (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    void run (int length) {
        System.out.println(name);
    }

    void swim (int length) {
        System.out.println(name);
    }
}
