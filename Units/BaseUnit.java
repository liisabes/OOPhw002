package Units;
public abstract class BaseUnit implements GameInterface {

    protected String name;
    protected int hp, maxhp, attack, defense, speed;

    public BaseUnit(String name, int hp, int maxhp, int attack, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.maxhp = maxhp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public void Run() {
        System.out.println(name + " is running");
    }

    public void Walk() {
        System.out.println(name + " is walking");
    }

    public void Attack() {
        System.out.println(name + " is attacking");
    }

    public void Defense() {
        System.out.println(name + " is defending");
    }

}