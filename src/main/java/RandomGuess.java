import javax.swing.*;

public class RandomGuess {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog (null, "Numărul este" + (1 + (int) (Math.random () * 10)));
    }
}
