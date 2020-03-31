package exam;

public class Wild extends Animals implements CanEat{
    protected int strength;
    protected int kickedAway;

    public Wild(String name, int weight, int speed, int strength, int kickedAway) {
        super(name, weight, speed);
        setStrength(strength);
        setKickedAway(kickedAway);
    }

    public int getKickedAway() {
        return kickedAway;
    }

    public void setKickedAway(int kickedAway) {
        this.kickedAway = kickedAway;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void eat(Wild pets) {

    }

    @Override
    public String toString() {
        return "Wild{" +
                " name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", strength=" + strength +
                ", kickedAway=" + kickedAway +
                '}';
    }
}
