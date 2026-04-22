package ARRAYLIST;


import java.util.ArrayList;
import java.util.Collections;

public class Basics {
    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();

        // adding elements
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("apple");
        fruit.add("orange");
        System.out.println(fruit);

        // removing element
        fruit.remove(2);
        System.out.println(fruit);

        // replacing
        fruit.set(0, "pineapple");
        System.out.println(fruit);

        // get element
        System.out.println(fruit.get(2));

        // size
        System.out.println(fruit.size());

        // sorting
        Collections.sort(fruit);
        System.out.println(fruit);

        // contains
        String item = "banana";
        if (fruit.contains(item)) {
            System.out.println("element found");
        }

        // reverse print
        for (int i = fruit.size() - 1; i >= 0; i--) {
            System.out.println(fruit.get(i));
        }
    }
}