package ARRAY;

public class array_substring {

    public static void main(String[] args) {

        String[] fruits = {"apple","banana","pineapple","mango"};  // ✅ 'fruits'
        String find = "pple";
        boolean found = false;

        for (String fruit : fruits) {
            if (fruit.contains(find)) {
                System.out.println("Found substring in: " + fruit);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Substring not found in any element.");
        }
    }
}
