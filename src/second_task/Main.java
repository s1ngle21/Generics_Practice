package second_task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Box<Apple> appleBox = new Box<>();
        appleBox.add(apple);
        appleBox.add(apple1);
        appleBox.add(apple2);

        System.out.println("Weight of apple box: " + appleBox.getWeight());


        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        List<Orange> oranges = new ArrayList<>();
        oranges.add(orange);
        oranges.add(orange1);
        oranges.add(orange2);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addAll(oranges);


        System.out.println("Weight of orange box: " + orangeBox.getWeight());

        System.out.println("Is apple box equal to orange box? " + appleBox.compare(orangeBox));


    }

}
