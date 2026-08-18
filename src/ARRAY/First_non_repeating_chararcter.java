package ARRAY;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Scanner;

public class First_non_repeating_chararcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        HashMap<Character,Integer>h=new HashMap<>();

        for (char ch:input.toCharArray()){
            h.put(ch,h.getOrDefault(ch,0)+1);
        }

        for (char ch:input.toCharArray()){
            if (h.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
        }

