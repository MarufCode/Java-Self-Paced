package src.Interview_Programs;

import java.util.Scanner;

public class swapping_two_variables {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a  = scanner.nextInt();
        System.out.println("Enter the value of b ");
        int b = scanner.nextInt();


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
