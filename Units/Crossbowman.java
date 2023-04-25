package Units;

public class Crossbowman extends Crossbowmen {

    public Crossbowman(String name) {
        super(name, 1, 1, 1, 1, 1, 1, 1, 1);
    }

    public String toString() {
        return "\nАрбалетчик";
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
        ";\nКол-во стрел: " + arrow + 
        ";\nКол-во арбалетов: " + crossbow +
        ";\nКол-во наконечников " + tip;
    }
}
