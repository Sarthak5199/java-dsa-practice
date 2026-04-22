package ARRAYLIST;

import java.util.ArrayList;

public class arraylist_remove_even_numbers {
    public static void main(String[] args) {

        ArrayList<Integer> i=new ArrayList<>();
        i.add(9);
        i.add(3);
        i.add(2);
        i.add(7);
        i.add(5);
        i.add(8);
        i.add(1);
        i.add(10);
        for (int k=0;k<i.size();k++){
            if (i.get(k)%2==0){
                System.out.println(" even number found  : "+i.get(k));
                i.remove(k);

            }
        }
        System.out.println(i);
    }
}
