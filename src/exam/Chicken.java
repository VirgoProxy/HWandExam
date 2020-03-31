package exam;

public class Chicken extends Pets implements GiveRes {
    public Chicken(String name, int weight, int speed, int hp, int resources, int maxHP) {
        super(name, weight, speed, hp, resources, maxHP);
    }



    @Override
    public void give(Pets resources) {

    }
    @Override
    public void run() {
        System.out.println("Курица сбежала!");
    }
    @Override
    public void eaten() {
        System.out.println("Курицу поймали и съели, она не вернется на ферму.");
    }
}
