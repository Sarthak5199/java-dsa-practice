package STRINGS;

import java.util.Scanner;

public class count_vowels_consants {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input=sc.nextLine();

        char [] arr = input.toCharArray();
        int vowels=0;
        int costants=0;

        for (int i =0;i<arr.length;i++){
            if (arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z') {


                if (arr[i] == 'a' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'e' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'U' || arr[i] == 'I' || arr[i] == 'E' || arr[i] == 'O') {
                    vowels++;
                } else{
                    costants++;
                }
            }
        }
        System.out.println(vowels);

        System.out.println(costants);
    }
}
