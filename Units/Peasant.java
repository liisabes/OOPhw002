package Units;

public class Peasant extends Peasants {

    public Peasant(String name) {
        super(name, 1, 1, 1, 1, 1, 1, 1, 1);
    }

    public String toString() {
        return "\nКрестьянин";
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
        ";\nКол-во урожая: " + crop +
        ";\nКол-во домов: " + house +
        ";\nКол-во животных: " + animal;
    }

}
