package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// arrange half array ascending and half descending

public class array_manipulation {
    public static void main(String[] args) {

        int [] arr={1,8,17,6,4,9,3,4};

        int n=arr.length;
        int half=n/2;
        Arrays.sort(arr);
        System.out.println(arr);
        for (int i =0;i<half;i++){
            System.out.print(arr[i]+" ");
        }

        for (int i=n-1;i>half;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
