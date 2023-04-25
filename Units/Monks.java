package Units;

public abstract class Monks extends BaseUnit implements GameInterface {

    protected int countsharePower;
    
    public Monks(String name, int hp, int maxhp, int attack, int defense, int speed, int countsharePower) {
        super(name, hp, maxhp, attack, defense, speed);
        this.countsharePower = countsharePower;
    }
    
    public void SharePower() {
        System.out.println(name + " is sharing the power now");
    }
}
