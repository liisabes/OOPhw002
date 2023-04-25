package Units;
public abstract class Snipers extends BaseUnit implements GameInterface {

    protected int rifle, accurateShot;

    public Snipers(String name, int hp, int maxhp, int attack, int defense, int speed, int rifle, int accurateShot) {
        super(name, hp, maxhp, attack, defense, speed);
        this.rifle = rifle;
        this.accurateShot = accurateShot;
    }

    public void Shoot() {
        System.out.println(name + " is shooting");
    }

    public void Aim() {
        System.out.println(name + " is aiming");
    }

    public void Hide() {
        System.out.println(name + " is hiding");
    }
    
}
