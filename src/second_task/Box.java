package second_task;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruits> {
    private List<Fruits> fruits = new ArrayList<>();

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
        for (Fruits f : fruits) {
            totalWeight += f.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0000001;
    }

    public void merge(Box<T> otherBoxOfFruits) {
       if (this.fruits == otherBoxOfFruits) {
           return;
       }
       if (fruits.getClass() != otherBoxOfFruits.fruits.getClass()) {
           throw new IllegalArgumentException("It is impossible to overfill the fruit of different types");
       }
       fruits.addAll(otherBoxOfFruits.fruits);
    }




}
