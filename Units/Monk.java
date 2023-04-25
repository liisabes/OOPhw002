package Units;

public class Monk extends Monks{

    public Monk(String name) {
        super(name, 1, 1, 1, 1, 1, 1);
    }

    public String toString() {
        return "\nМонах";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return 
        "Имя: " + name + 
        ";\nЗдоровье: " + hp + 
        ";\nМаксимальное здоровье: " + maxhp + 
        ";\nКол-во атак: " + attack + 
        ";\nКол-во защит: " + defense + 
        ";\nСкорость: " + speed + 
        ";\nСила помощи: " + countsharePower;
    }

}
