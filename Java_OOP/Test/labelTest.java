package Test;

import java.awt.*;

public class labelTest extends Frame {
    Label label = new Label("This is just a label");

    public labelTest(String title) {
        super(title);
        add(label);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
    }

    public static void main(String[] args) {
        labelTest frame = new labelTest("Label");
        frame.setSize(300, 200);
        frame.setVisible(true); // Make the frame visible
    }
}
