package src.Interview_Programs;

import java.util.Scanner;

public class check_Palindrome {
    public static void main(String[] args) {

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the string");
//        String user_input = scanner.next();
//        String temp = "";
//
//
//        for (int i = user_input.length()-1; i>=0; i--){
//            temp = temp + user_input.charAt(i);
//        }
//        if (user_input.equalsIgnoreCase(temp)){
//            System.out.println("its is palindrome " + temp);
//        }else {
//            System.out.println("Not palindrome " + temp);
//        }



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = sc.next();
        String temp= "";


        for (int i = name.length()-1; i>=0; i--){
            temp = temp + name.charAt(i);
        }
            if (name.equalsIgnoreCase(temp)){
                System.out.println("It is Palindrome");
            }else {
                System.out.println("It is not Palindrome");
            }







    }
}
