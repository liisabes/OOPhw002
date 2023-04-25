package Units;

public class Outlaw extends Outlaws {

    public Outlaw(String name) {
        super(name, 1, 1, 1, 1, 1, 1, 1);
    }

    public String toString() {
        return "\nПреступник";
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
        ";\nКол-во патронов: " + cartridge +
        ";\nКол-во золота: " + gold;
    }

}
