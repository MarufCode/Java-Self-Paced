package src.OOPS.Poly.method_overriding;

public class Animal_RC {

    public static void main(String[] args) {


        Dog d = new Dog();
        d.sound();


        Hound h = new Hound();
        h.sound();

        Animal a = new Animal();
        a.sound();
    }
}
