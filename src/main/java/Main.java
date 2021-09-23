public class Main {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Bart","black",3);
        Dog firstDog = new Dog("Frodo","white",2);
        Dog secondDog = new Dog("Gendalf","black",4);

        firstCat.run(100);
        firstCat.run(300);
        firstDog.run(300);
        firstDog.run(600);

        firstCat.swim(8);
        firstDog.swim(7);

        System.out.println("Всего животных: " + Animal.count);
        System.out.println("Всего котов: " + Cat.count);
        System.out.println("Всего собак: " + Dog.count);
    }
}