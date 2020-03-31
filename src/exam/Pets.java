package exam;

public class Pets extends Animals implements CanBeEaten, CanRun{
    protected int hp;
    protected int resources;
    protected int maxHP;


    public Pets(String name, int weight, int speed, int hp, int resources, int maxHP) {
        super(name, weight, speed);
        setHp(hp);
        setResources(resources);
        setMaxHP(maxHP);
    }
    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getResources() {
        return this.resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    @Override
    public void eaten() {

    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return "Pets{" +
                " name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", hp=" + hp +
                ", resources=" + resources +
                ", maxHP=" + maxHP +
                '}';
    }
}
