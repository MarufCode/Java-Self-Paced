package src.Interview_Programs;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number nd i will tell you is it even or odd");
        int num = scanner.nextInt();

//        for (int i = 0; i <=100 ; i++) {
            if (num%2==0){
                System.out.println(num + " is even number");
            }else {
                System.out.println(num + " is odd number");
            }

        }









}

