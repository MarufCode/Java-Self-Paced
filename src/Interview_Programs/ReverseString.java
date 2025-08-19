package src.Interview_Programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.next();
        String  y = "";


        for (int i = input.length()-1; i>=0;i--){
            y = y + input.charAt(i);
        }

        System.out.println(y);

//        USing String Builder


        StringBuilder sb = new StringBuilder("Sherikar");
        sb.reverse();
        System.out.println(sb);





    }
}
