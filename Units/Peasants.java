package Units;

public abstract class Peasants extends BaseUnit implements GameInterface {

    protected int crop, house, animal;

    public Peasants(String name, int hp, int maxhp, int attack, int defense, int speed, int crop, int house, int animal) {
        super(name, hp, maxhp, attack, defense, speed);
        this.crop = crop;
        this.house = house;
        this.animal = animal;
    }

    public void Harvest() {
        System.out.println(name + "is harvesting");
    }

    public void Plant() {
        System.out.println(name + "is sowing planting");
    }

    public void FeedAnimal() {
        System.out.println(name + "is sowing  feeding the animal");
    }

}
