import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> boxFruit = new ArrayList<>();
    private String name;
    private Fruit boxType;

    public Box(String name) {
        this.name = name;
        System.out.println("Создана " + name);
    }

    public String getName() {
        return name;
    }

    public void addFruit(Fruit newFruit) {
        if (boxFruit.size() == 0) {
            boxType = newFruit;
        }
        else if (newFruit.getType().compareTo(boxType.getType()) < 0) {
            System.out.println("Недопустимо добавление " + newFruit.getType());
            return;
        }
        boxFruit.add(newFruit);
        //System.out.printf("Добавлен(о) %s в %s\n", newFruit.getType(), name);
    }

    public int getCountFruit() {
        return boxFruit.size();
    }

    public void delFruit() {
        if (getCountFruit() == 0) {
            System.out.println("Тут нет фруктов!");
            return;
        }
        boxFruit.remove(0);
    }

    public boolean compare (Box comparedBox) {
        return comparedBox.getWeight() == getWeight();
    }

    public double getWeight() {
        return boxFruit.size() * boxType.weight;
    }

    public void putIn(Box boxTo) {
        if (boxType.getType().compareTo(boxTo.boxType.getType()) != 0) {
            System.out.println("Недопустимая операция! Нельзя пересыпать эту коробку!");
            return;
        }
        while (boxFruit.size() > 0) {
            boxTo.addFruit(boxFruit.get(0));
            delFruit();
        }
    }
}
