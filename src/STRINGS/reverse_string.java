package STRINGS;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        System.out.println(" enter an string to reverse it");
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();

        char []arr=input.toCharArray();
       int left=0;
       int right=arr.length-1;
       while (left<right){
           char temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;

       }
        System.out.println(arr);

    }
}
