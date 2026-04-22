package JAVA_BASICS;

import java.util.Scanner;

public class prime {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println(" enter an number N ****");
        int N = sc.nextInt();
        boolean isprime=true;





        for (int i=2;i<N;i++){

            if (N%i==0){
                isprime=false;
                break;
            }

        }
        if (isprime){
            System.out.println(" number is prime");
        }
        else {
            System.out.println(" number is not prime");
        }


    }
}
