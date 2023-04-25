package Units;

public class Spearman extends Spearmen {

    public Spearman(String name) {
        super(name, 1, 1, 1, 1, 1, 1);
        //TODO Auto-generated constructor stub
    }
    
    public String toString() {
        return "\nКопейщик";
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
        ";\nКол-во копий: " + spear;
    }
}
