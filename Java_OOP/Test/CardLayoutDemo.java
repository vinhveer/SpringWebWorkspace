package Test;

import java.awt.*;
import javax.swing.*;

public class CardLayoutDemo extends JApplet {
    Button back, next;
    JLabel label1, label2, label3, label4;
    JTextField other1;
    JPanel panel1, first, second, third, fourth;
    CardLayout card1;

    public void init() {
        back = new Button("Back");
        next = new Button("Next");
        add(back, BorderLayout.WEST);
        add(next, BorderLayout.EAST);

        card1 = new CardLayout();
        panel1 = new JPanel();
        panel1.setLayout(card1);

        label1 = new JLabel("First");
        label2 = new JLabel("Second");
        label3 = new JLabel("Third");
        label4 = new JLabel("Fourth");

        first = new JPanel();
        first.add(label1);

        second = new JPanel();
        second.add(label2);

        third = new JPanel();
        third.add(label3);

        fourth = new JPanel();
        fourth.add(label4);

        panel1.add("1", first);
        panel1.add("2", second);
        panel1.add("3", third);
        panel1.add("4", fourth);

        add(panel1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Card Layout Demo");
                CardLayoutDemo applet = new CardLayoutDemo();
                applet.init();
                frame.getContentPane().add(applet);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
