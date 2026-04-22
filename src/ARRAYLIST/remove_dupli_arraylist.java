package ARRAYLIST;

import java.util.ArrayList;

public class remove_dupli_arraylist {
    public static void main(String[] args) {
        // array continous memory storage  ,fixed sixe
        // arraylist non continous memory storage
        ArrayList<Integer> i=new ArrayList<>();
        i.add(9);
        i.add(10);
        i.add(19);
        System.out.println(i.get(2));
        i.add(1,2);
        //  System.out.println(i.contains(9));
        i.add(15);
        i.add(18);
        i.add(5);
        i.add(15);
        i.add(9);
        i.add(10);


        for (int k=0;k<=i.size()-1;k++){
            for (int j=k+1;j<=i.size()-1;j++){
                if (i.get(k).equals(i.get(j))){
                    System.out.println(" duplicate found at  index : "+j+" element is ::  "+i.get(j)+" removed ");
                    i.remove(j);
                    j--;

                }
            }
        }
        System.out.println(i);
    }
}
