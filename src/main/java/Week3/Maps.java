package Week3;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> favoriteFruits = new HashMap<>();
        favoriteFruits.put("Grecia ", " Banana");
        favoriteFruits.put("Cesar ", " Guava");
        favoriteFruits.put("Joezari ", " Mango");
        favoriteFruits.put("Akbar ", " Kiwi");

        System.out.println(favoriteFruits);

        Map<Integer, Integer> squared = new HashMap<>();
        squared.put(1 , 1);
        squared.put(2 , 4);
        squared.put(3 , 9);
        squared.put(4 , 16);
        squared.put(5 , 25);

        System.out.println(squared);
        Map<String, String> owners = new HashMap<>();
        owners.put("Jake owns ", " 8 Shibas");
        owners.put("Mario owns ", " 12 Poodles");
        owners.put("Evan owns ", " 14 Dalmatians");
        owners.put("Lilah owns ", " 6 Pit bulls");

        System.out.println(owners);

    }
}
