package src.BuilderPattern;

public class NonBuilderPattern {

    public void stage1(){
        System.out.println("Stage 1");
    }

    public void stage2(){
        System.out.println("stage 2");
    }


    public static void main(String[] args) {
        NonBuilderPattern nbp = new NonBuilderPattern();
        nbp.stage1();
        nbp.stage2();

    }
}
