public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void infoPlate(){
        System.out.println("Food: "+ food);
    }

    public void decreaseFood(int amount){
        food -= amount;
    }

    public void fillPlate(Plate plate, int food){
        this.food = food;
    }
}