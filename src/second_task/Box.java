package second_task;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<Fruit> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void addAll(List<T> fruit) {
        for (T f : fruit) {
            fruits.add(f);
        }
    }

    public double getWeight() {
        float totalWeight = 0.0F;
        for (Fruit f : fruits) {
            totalWeight += f.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> box) {
        return (Double.compare(this.getWeight(), box.getWeight()) == 0);
    }

    public void merge(Box<T> otherBoxOfFruits) {
        for (Fruit fruit : otherBoxOfFruits.fruits) {
            if (!fruits.get(0).getClass().equals(fruit.getClass())) {
                throw new IllegalArgumentException("It is impossible to overfill the fruit of different types");
            }
        }
        fruits.addAll(otherBoxOfFruits.fruits);
    }


}
