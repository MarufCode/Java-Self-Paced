package src.OOPS.Poly.method_overloading;

public class Car {

    String name;



//    Car(){
//        System.out.println("This is DC");
//        }


    void run(String a){
        System.out.println("Name -> " + a);
    }


    void run(int x){
        System.out.println("Speed -> " + x);
    }

}
