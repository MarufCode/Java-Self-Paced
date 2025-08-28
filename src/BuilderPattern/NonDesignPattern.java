package src.BuilderPattern;

public class NonDesignPattern {

    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }


    public static void main(String[] args) {

        NonDesignPattern np = new NonDesignPattern();
        np.step1();
        np.step2();
    }
}
