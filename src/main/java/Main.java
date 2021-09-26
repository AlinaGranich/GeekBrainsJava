public class Main {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Bart",10);
        Plate firstPlate = new Plate(200);


        firstPlate.info();
        firstCat.eat(firstPlate);
        firstPlate.info();

        Cat [] cats = new Cat[3];
        cats[0] = new Cat("Barry",50);
        cats[1] = new Cat("Bright",60);
        cats[2] = new Cat("Brain",100);

        for (int i =0; i < 3; i++){
            cats[i].eat(firstPlate);
            cats[i].info();
        }

        firstPlate.info();
        firstPlate.increaseFood(100);
        firstPlate.info();

        for (int i =0; i < 3; i++){
            cats[i].eat(firstPlate);
            cats[i].info();
        }

        firstPlate.info();
    }

}