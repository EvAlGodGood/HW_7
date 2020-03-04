import java.util.Random;

public class Cat {
    private String name;
    private int hunger;
    private boolean hungerB;
    Random ran = new Random();

    public Cat(String name) {
        this.name = name;
        this.hunger = ran.nextInt(50);
        this.hungerB = true;
    }

    public void eat(Plate plate) {
        if (hungerB && plate.getFood()>=hunger) {
            System.out.println("Cat " + name + " eat " + hunger);
            plate.decreaseFood(hunger);
            hungerB = false;
        }else{
            System.out.println("Cat " + name + "  not eat " + hunger);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isHungerB() {
        return hungerB;
    }
}