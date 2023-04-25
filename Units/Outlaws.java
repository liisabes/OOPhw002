package Units;

public abstract class Outlaws extends BaseUnit implements GameInterface {

    protected int cartridge, gold;

    public Outlaws(String name, int hp, int maxhp, int attack, int defense, int speed, int cartridge, int gold) {
        super(name, hp, maxhp, attack, defense, speed);
        this.cartridge = cartridge;
        this.gold = gold;
    }

    public void Rob() {
        System.out.println(name + " is robbing");
    }

    public void Steal() {
        System.out.println(name + " is stealing");
    }

    public void Vandalize() {
        System.out.println(name + " is vandalizing");
    }
}
