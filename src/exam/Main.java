package exam;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Cow", 20, 5, 50, 3, 50);
        Cat cat = new Cat("Cat", 5, 15, 15, 0, 15);
        Chicken chicken = new Chicken("Chicken", 5, 10, 10, 2, 10);
        Rabbit rabbit = new Rabbit("Rabbit", 10, 20, 20, 0, 20);

        Bear bear = new Bear("Bear", 50, 5, 20, 0);
        Fox fox = new Fox("Fox", 20, 20, 5, 0);
        Wolf wolf = new Wolf("Wolf", 25, 15, 10, 0);

        Farm farm = new Farm();
        farm.addPets(cat, chicken, cow, rabbit);
        farm.addWild(wolf, fox, bear);
        farm.setIsOnFarm(farm.isOnFarm);
        farm.setIsInForest(farm.isOnFarm);



        System.out.println(Arrays.toString(farm.pets));
        System.out.println(Arrays.toString(farm.wild));
        System.out.println(Arrays.toString(farm.isOnFarm));
        System.out.println(Arrays.toString(farm.isOnFarm));
        farm.passDay();
    }
}
