package src.OOPS.Poly.method_overriding;

public class RC_Bank {

    public static void main(String[] args) {

      Bank b1 = new HDFC();
      Bank b2 = new SBI();
      Bank b3 = new YES();


        System.out.println("HDFC -> Rate of interest" + b1.rateOfInterest() + "%");
        System.out.println("SBI -> Rate of interest" + b2.rateOfInterest() + "%");
        System.out.println("YES -> Rate of interest" + b3.rateOfInterest() + "%");


    }
}
