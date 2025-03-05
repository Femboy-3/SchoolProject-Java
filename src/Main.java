import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Application");
        window.setSize(500, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 70, 100, 30);
        button.setBackground(new Color(0, 255, 0));
        button.addActionListener(e -> Print("Nikola Marnikovic"));
        window.add(button);

        window.setVisible(true);
    }

    public static void Print(String msg){
        System.out.println(msg);
    }
}