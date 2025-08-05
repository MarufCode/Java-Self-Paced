package src.Interview_Programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name  = sc.next();
        String temp = "";


        for (int i = name.length()-1;i>=0;i--){
            temp = temp + name.charAt(i);
        }

        System.out.println(temp);



//        USing String Builder


        StringBuilder sb = new StringBuilder("Sherikar");
        sb.reverse();
        System.out.println(sb);





    }
}
