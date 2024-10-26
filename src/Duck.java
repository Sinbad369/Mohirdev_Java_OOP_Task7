public class Duck extends Animal{

    @Override
    String name() {
        return "Brian";
    }

    @Override
    void sound() {
        System.out.println("Quack - Quack");
    }
}
