package exam;

public class Cow extends Pets implements GiveRes {
    public Cow(String name, int weight, int speed, int hp, int resources, int maxHP) {
        super(name, weight, speed, hp, resources, maxHP);
    }

    @Override
    public void give(Pets resources) {

    }
    @Override
    public void run() {
        System.out.println("Корова сбежала!");
    }
    @Override
    public void eaten() {
        System.out.println("Корову поймали и съели, она не вернется на ферму.");
    }
}
