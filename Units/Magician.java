package Units;

public class Magician extends Magicians{

    public Magician(String name) {
        super(name, 1, 1, 1, 1, 1, 1, 1, 1);
    }

    public String toString() {
        return "\nВолшебник";
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
        ";\nСила здоровья: " + healingPower + 
        ";\nСила защиты: " + protectionPower +
        ";\nСила магии " + magicPower;
    }
    
}
