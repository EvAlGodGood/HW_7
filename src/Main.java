public class Main {

    public static void main(String[] args) {
        int count;
        Cat[] cats = {
                new Cat("Murzik"),
                new Cat("Barsik"),
                new Cat("Buzyia"),
                new Cat("Hellcat"),
                new Cat("Black Jack")
        };
        Plate plate = new Plate(50);

        while(true){
            count = 0;
            for (int i=0; i<cats.length; i++){
                cats[i].eat(plate);
                plate.infoPlate();
            }

            for (int i=0; i<cats.length; i++){
                System.out.println(cats[i].getName() +" hunger "+cats[i].isHungerB());
                if (!cats[i].isHungerB()){
                    count++;
                }
            }

            if (count==5){
                System.out.println("All cats are full!!!");
                break;
            }
            System.out.println("Not all cats are full, we fill the plate ...");
            plate.fillPlate(plate, 50);
            plate.infoPlate();
        }

    }
}