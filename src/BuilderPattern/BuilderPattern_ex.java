package src.BuilderPattern;

public class BuilderPattern_ex {

    public BuilderPattern_ex step1(){
        System.out.println("Step 1");
        return this;
    }

    public BuilderPattern_ex step2(){
        System.out.println("step 2");
        return this;
    }


    public static void main(String[] args) {

        BuilderPattern_ex bp = new BuilderPattern_ex();
        bp.step1().step2();


    }


}
