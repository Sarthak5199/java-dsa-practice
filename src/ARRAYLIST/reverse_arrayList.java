package ARRAYLIST;

import java.util.ArrayList;

public class reverse_arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(9);
        i.add(10);
        i.add(3);
        i.add(2);
        i.add(8);
        i.add(7);
        int left=0;
        int right=i.size()-1;
        while(left < right){
            int temp=i.get(left);
            i.set(left,i.get(right));
            i.set(right,temp);
            left++;
            right--;
        }
        System.out.println(i);
    }
}
