package Units;

public abstract class Spearmen extends BaseUnit implements GameInterface {

    protected int spear;

    public Spearmen(String name, int hp, int maxhp, int attack, int defense, int speed, int spear) {
        super(name, hp, maxhp, attack, defense, speed);
        this.spear = spear;
    }

    public void Help() {
        System.out.println(name + " is helping");
    }

    public void Kill() {
        System.out.println(name + " is killing");
    }

    public void Die() {
        System.out.println(name + " is dieing");
    }
    
}
