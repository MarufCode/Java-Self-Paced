package src.OOPS.Poly.method_overloading;

public class Bike {


    void Bike_Details(int x){
        System.out.println(x + " km/h ");
    }


    void Bike_Details(String name){
        System.out.println("Bike name is -> " + name);
    }

    void Bike_Details(Boolean y){
        if (y == true){
            System.out.println("Full Condition");
        }else{
            System.out.println("Avg");
        }
    }
}
