import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(new FormData().getRoot());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}