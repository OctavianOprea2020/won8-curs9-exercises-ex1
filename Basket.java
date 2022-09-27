package curs9.homework09.ex1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    static int noOfSameFruit = 0;
    public static List<String> fruitBasket = new ArrayList<>();

    public static int getNoOfSameFruit() {
        return noOfSameFruit;
    }

    public static void setNoOfSameFruit(int noOfSameFruit) {
        Basket.noOfSameFruit = noOfSameFruit;
    }

    public static List<String> getFruitBasket() {
        return fruitBasket;
    }

    public static void setFruitBasket(List<String> fruitBasket) {
        Basket.fruitBasket = fruitBasket;
    }

    public static boolean find(List<String> fruitBasket, String fruit) {
        if (fruit.trim().isEmpty())
            return false;

        int nSize = fruitBasket.size();
        if (nSize == 0)
            return false;

        for (int i = 0; i < nSize; i++)
            if (fruitBasket.get(i) == fruit)
                return true;

        return false;
    }

    static int position(List<String> fruitBasket, String fruit) {
        if (fruit.trim().isEmpty())
            return -1;

        int nSize = fruitBasket.size();
        if (nSize == 0)
            return -1;

        for (int i = 0; i < nSize; i++)
            if (fruitBasket.get(i) == fruit)
                return i;

        return -1;
    }

    static boolean remove(List<String> fruitBasket, String fruit) {
        if (fruit.trim().isEmpty())
            return false;

        int nSize = fruitBasket.size();
        if (nSize == 0)
            return false;

        if (position(fruitBasket, fruit) == -1)
            return false;

        System.out.println("Initial basket's size: " + nSize + ".");
        boolean found = false;
        noOfSameFruit = 0;
        for (int i = 0; i < nSize; i++)
            if (fruitBasket.get(i) == fruit) {
                fruitBasket.remove(i);
                nSize = fruitBasket.size();
                found = true;
                noOfSameFruit++;
                System.out.println("Fruit '" + fruit + "' is removed from basket.");
                System.out.println("Basket's size is updated: " + nSize + ".");
            }

        return found;
    }

    static void add(List<String> fruitBasket, String fruit) {
        if (fruit.trim().isEmpty())
            return;

        fruitBasket.add(fruit);
        return;
    }

    static int count(List<String> fruitBasket) {
        return fruitBasket.size();
    }

    static int customCount(List<String> fruitBasket) {
        if (fruitBasket.isEmpty())
            return 0;

        int basketSize = 0;
        for (String fruit : fruitBasket)
            basketSize++;

        return basketSize;
    }

    static List<String> distinct(List<String> fruitBasket) {
        List<String> distinctBasket = new ArrayList<>();

        if (fruitBasket.size() > 0) {
            distinctBasket.add(fruitBasket.get(0));

            for (int i = 1; i < fruitBasket.size();i++) {
                boolean found = false;
                for (int j = 0; j < distinctBasket.size() ; j++) {
                    if (fruitBasket.get(i) == distinctBasket.get(j))
                        found = true;
                }
                if (!found)
                    distinctBasket.add(fruitBasket.get(i));
            }

        }

        return distinctBasket;
    }

}
