public class Plate {
    private int food;

    public Plate (int food){
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood (int appetite) {
        this.food -= appetite;
    }

    public void increaseFood (int food) {
        this.food += food;
    }

    public void info () {
        System.out.println("plate:" + food);
    }
}
