public class Cat extends Animal{

    @Override
    String name() {
        return "Albert";
    }

    @Override
    void sound() {
        System.out.println("Meow - Meow");
    }
}
