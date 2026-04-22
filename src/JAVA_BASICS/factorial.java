package JAVA_BASICS;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        System.out.println(" enter a number to find its factorial");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        BigInteger fact= BigInteger.ONE;

        for (int i=1;i<=num;i++){
            fact = fact.multiply( BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
