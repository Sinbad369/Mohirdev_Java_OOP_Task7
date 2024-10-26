public class Dog extends Animal{


    @Override
    String name() {
        return "Josh";
    }

    @Override
    void sound() {
        System.out.println("Bow - Bow");
    }
}
