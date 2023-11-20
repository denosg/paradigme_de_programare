package teme.lab6.pb1;

public class Lion extends Animal{
    @Override
    void eat() {
        System.out.println("Lion is eating humans.");
    }

    @Override
    void sound() {
        System.out.println("Lion sounds like: meow");
    }
}
