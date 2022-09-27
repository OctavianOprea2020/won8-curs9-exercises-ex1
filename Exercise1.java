package curs9.homework09.ex1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        List<String> basketList = new ArrayList<>();
        basketList.add("Apple");
        basketList.add("Orange");
        basketList.add("Plum");
        basketList.add("Kiwi");
        basketList.add("Peach");
        basketList.add("Strawberry");
        basketList.add("Pear");

        System.out.println("Basket: " + basketList + ".");
        System.out.println();

        Basket basketOfFruits = new Basket();

        // (1) find(String):boolean
        // - finds if received fruit is in the list and returns true/false
        // (a)
        System.out.println("(1)");
        String fruit = "Kiwi";
        String found = (basketOfFruits.find(basketList, fruit) ? "" : "not ");
        System.out.println("Fruit '" + fruit + "' was " + found + "found in the basket.");

        // (b)
        fruit = "Grape";
        found = (basketOfFruits.find(basketList, fruit) ? "" : "not ");
        System.out.println("Fruit '" + fruit + "' was " + found + "found in the basket.");
        System.out.println();

        // (2) position(String):int
        // - returns the position on which the received fruit is in the basket
        // (a)
        System.out.println("(2)");
        fruit = "Kiwi";
        int positionFound = basketOfFruits.position(basketList, fruit);
        if (positionFound == -1)
            System.out.println("Fruit '" + fruit + "' was not found in the basket.");
        else
            System.out.println("Fruit '" + fruit + "' was found in the basket at position #" + positionFound + ".");

        // (b)
        fruit = "Watermelon";
        positionFound = basketOfFruits.position(basketList, fruit);
        if (positionFound == -1)
            System.out.println("Fruit '" + fruit + "' was not found in the basket.");
        else
            System.out.println("Fruit '" + fruit + "' was found in the basket at position # " + positionFound + ".");
        System.out.println();

        // (3) remove(String): boolean
        // - removes the received string returns true/false if found
        System.out.println("(3)");
        basketList.add("Kiwi");

        System.out.println("Initial Basket: " + basketList + ".");

        // (a)
        fruit = "Kiwi";
        System.out.println("Fruit: " + fruit + ".");
        if (basketOfFruits.remove(basketList, fruit))
            System.out.println("Fruit '" + fruit + "' was found in the basket and it was removed " + basketOfFruits.noOfSameFruit + " times.");
        else
            System.out.println("Fruit '" + fruit + "' was not found in the basket.");
        System.out.println("Final Basket: " + basketList + ".");

        // (b)
        System.out.println();
        System.out.println("Initial Basket: " + basketList + ".");
        fruit = "Strawberry";
        System.out.println("Fruit: " + fruit + ".");
        if (basketOfFruits.remove(basketList, fruit))
            System.out.println("Fruit '" + fruit + "' was found in the basket and it was removed " + basketOfFruits.noOfSameFruit + " times.");
        else
            System.out.println("Fruit '" + fruit + "' was not found in the basket.");
        System.out.println("Final Basket: " + basketList + ".");

        // (c)
        System.out.println();
        System.out.println("Initial Basket: " + basketList + ".");
        fruit = "Raspberry";
        System.out.println("Fruit: " + fruit + ".");
        if (basketOfFruits.remove(basketList, fruit))
            System.out.println("Fruit '" + fruit + "' was found in the basket and it was removed " + basketOfFruits.noOfSameFruit + " times.");
        else
            System.out.println("Fruit '" + fruit + "' was not found in the basket.");

        System.out.println("Final Basket: " + basketList + ".");

        // (4) distinct(): Collection<String>
        // - returns an unique collection containing all fruits once
        // (a)
        System.out.println("");
        System.out.println("(4)");
        System.out.println("Initial Basket: " + basketList + ".");
        System.out.println("The distinct fruits in the basket are: " + basketOfFruits.distinct(basketList) + ".");

        // (b)
        System.out.println("");
        basketList.add("Apple");
        basketList.add("Kiwi");
        basketList.add("Apple");
        basketList.add("Plum");
        System.out.println("Initial Basket: " + basketList + ".");
        System.out.println("The distinct fruits in the basket are: " + basketOfFruits.distinct(basketList) + ".");

        // (5) add(String)
        // - adds a fruit to the basket
        // (a)
        System.out.println("");
        System.out.println("(5)");
        fruit = "Kiwi";
        System.out.println("Initial Basket: " + basketList + ".");
        basketOfFruits.add(basketList, fruit);
        System.out.println("Basket after adding fruit '" + fruit + "': " + basketList + ".");

        // (b)
        System.out.println("");
        fruit = "Blueberry";
        System.out.println("Initial Basket: " + basketList + ".");
        basketOfFruits.add(basketList, fruit);
        System.out.println("Basket after adding fruit '" + fruit + "': " + basketList + ".");

        // (6) count():int
        // - count the fruits
        System.out.println("");
        System.out.println("(6)");
        System.out.println("There is a total of " + basketOfFruits.count(basketList) + " fruits in the basket: " + basketList + " (using size()).");

        // (7) customCount():int
        // - count the fruits without using size method (use a loop control statement + counter)
        System.out.println("");
        System.out.println("(7)");
        System.out.println("There is a total of " + basketOfFruits.customCount(basketList) + " fruits in the basket " + basketList + " (without using size()).");
    }
}
