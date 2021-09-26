public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void info (){
        System.out.print(this.name + ": ");
        if (this.fullness) {
            System.out.println("я сыт");
        } else {
            System.out.println("я вижу дно");
        }
    }

    public void eat(Plate plate){
        if(!this.fullness && appetite < plate.getFood()) {
            plate.decreaseFood(appetite);
            this.fullness = true;
        }
    }
}
