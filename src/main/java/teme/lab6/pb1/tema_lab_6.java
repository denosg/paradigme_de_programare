package teme.lab6.pb1;

public class tema_lab_6 {

    public static void main(String[] args) {
        Animal tigru = new Tiger();
        Animal leu = new Lion();
        Animal pantera = new Panther();
        leu.eat();
        tigru.eat();
        pantera.eat();
        leu.sound();
        tigru.sound();
        pantera.sound();
    }
}
