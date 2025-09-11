package src.Interview_Programs;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        long fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            fact = fact * i;
        }

        System.out.println("fact number is " + fact);






        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc1.nextInt();


        for (int i = 1; i<=number; i++){
            fact = fact * 1;

        }

        System.out.println(fact);


































    }
}
