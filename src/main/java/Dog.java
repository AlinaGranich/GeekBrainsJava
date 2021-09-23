public class Dog extends Animal {

    static int count = 0;

    Dog (String name, String color, int age){
        super(name, color, age);
        count++;
    }

    void run(int length) {
        if (length < 500) {
            System.out.println(name + " пробежал " + length + " метров");
        }
    }

    void swim (int length) {
        if (length < 10) {
            System.out.println(name + " проплыл " + length + " метров");
        }
    }
}
