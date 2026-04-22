package ARRAY;

import java.util.Arrays;

public class duplicates_in_array {
    public static void main(String[] args) {
        int [] num = {7,8,8,2,5,9,1,1,9};


        Arrays.sort(num);

        for (int i=0;i<num.length-1;i++){

            if (num[i]==num[i+1]){
                System.out.println(" duplicates are "+num[i]);
            }
        }
    }
}

