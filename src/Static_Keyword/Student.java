package src.Static_Keyword;

public class Student {

    int Roll_No;

    String Name;

    static String college_Name = "NMIMS";


    Student(int Roll_No, String Name){
        this.Roll_No = Roll_No;
        this.Name = Name;
    }


    public static void printCollegeName(){
        System.out.println("college name is " + college_Name);
    }


    public void details(){
        System.out.println(Roll_No + " " + Name + " " + college_Name);
    }



}
