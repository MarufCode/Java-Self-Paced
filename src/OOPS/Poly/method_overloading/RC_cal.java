package src.OOPS.Poly.method_overloading;

public class RC_cal {

    public static void main(String[] args) {

        calculator cal = new calculator();
        System.out.println(cal.add(3,4));
        System.out.println(cal.add(4,5, 5));

        System.out.println(cal.add(3.0, 3));

    }
}
