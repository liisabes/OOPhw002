package Units;
public class Sniper extends Snipers {

    public Sniper(String name) {
        super(name, 1, 1, 1, 1, 1, 1, 1);
    }

    public String toString() {
        return "\nСнайпер";
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
        ";\nКол-во винтовок: " + rifle +
        ";\nКол-во точных выстрелов: " + accurateShot;
    }

}
