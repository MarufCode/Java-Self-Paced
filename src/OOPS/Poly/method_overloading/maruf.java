package src.OOPS.Poly.method_overloading;

public class maruf {


    void Testing(String a){
        System.out.println(a);

    }

    void Testing(int x ){
        System.out.println( "means fees is paid " + x);
    }


    void Testing(boolean x){
        if (x==true){
            System.out.println("Yes, you are authorised as well as authenticated");
        }else {
            System.out.println("ohho!!! Not paid the fees!! ");
        }
    }


    void Testing(Object AT){
        System.out.println(AT);
    }
}
