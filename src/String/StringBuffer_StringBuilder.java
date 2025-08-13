package src.String;

public class StringBuffer_StringBuilder {
    public static void main(String[] args) {

        // Immutable in nature (That can not be changed)



        String s1 = "Maruf";
        System.out.println(s1);

        String s2 = new String("Sherikar");
        System.out.println(s2);

        StringBuilder sb = new StringBuilder("MahiBhai");
        sb.append("@7");
        System.out.println(sb);


        StringBuffer sbf = new StringBuffer("Java");
        sbf.append("Selenium");
        System.out.println(sbf);


        // String buffer is thread safe and StringBuilder is not Thread safe

        // Thread safe:
        // Thread safe means lets suppose we are two brother and we have only one bat so what will happen is
        // we will fight with each other for bat so in that case my mom comes in ad she is like StringBuffer
        // and she will say that when i am using the bat my brother can not use and vice versa


        // String buffer are slow compared to StringBuilder

        // people generally use StringBuilder













    }
}
