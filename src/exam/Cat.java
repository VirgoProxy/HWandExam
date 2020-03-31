package exam;

public class Cat extends Pets{
    public Cat(String name, int weight, int speed, int hp, int resources, int maxHP) {
        super(name, weight, speed, hp, resources, maxHP);
    }


    @Override
    public void run() {
        System.out.println("Кот сбежал!");
    }

    @Override
    public void eaten() {
        System.out.println("Кота поймали и съели, он не вернется на ферму.");
    }
}
