package Units;


public abstract class Magicians extends BaseUnit implements GameInterface{

    protected int healingPower, protectionPower, magicPower;

    public Magicians(String name, int hp, int maxhp, int attack, int defense, int speed, int healingPower, int protectionPower, int magicPower) {
        super(name, hp, maxhp, attack, defense, speed);
        this.healingPower = healingPower;
        this.protectionPower = protectionPower;
        this.magicPower = magicPower;
    }
    
    public void Heal() {
        System.out.println(name + " is treating someone");
    }

    public void Protect() {
        System.out.println(name + " is protecting someone");
    }

    public void Magic() {
        System.out.println(name + " is doing magic");
    }
}
