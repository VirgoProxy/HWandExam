package exam;

public class Rabbit extends Pets {
    public Rabbit(String name, int weight, int speed, int hp, int resources, int maxHP) {
        super(name, weight, speed, hp, resources, maxHP);
    }

    @Override
    public void run() {
        System.out.println("Кролик сбегает!");
    }
    @Override
    public void eaten() {
        System.out.println("Кролика поймали и съели, он не вернется на ферму.");
    }
}
