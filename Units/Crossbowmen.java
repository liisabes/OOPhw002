package Units;

public abstract class Crossbowmen extends BaseUnit implements GameInterface {

    protected int arrow, crossbow, tip;

    public Crossbowmen(String name, int hp, int maxhp, int attack, int defense, int speed, int arrow, int crossbow, int tip) {
        super(name, hp, maxhp, attack, defense, speed);
        this.arrow = arrow;
        this.crossbow = crossbow;
        this.tip = tip;
    }
    
    public void Hit() {
        System.out.println(name + " is hitting");
    }

}
