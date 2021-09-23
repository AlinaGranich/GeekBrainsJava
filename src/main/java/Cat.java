public class Cat extends Animal {

    static int count = 0;

    Cat(String name, String color, int age) {
        super(name, color, age);
        count++;
    }
    void run(int length) {
        if (length < 200) {
            System.out.println(name + " пробежал " + length + " метров");
        }
    }

    void swim(int length) {
        System.out.println(name + " не умеет плавать");
    }

}
