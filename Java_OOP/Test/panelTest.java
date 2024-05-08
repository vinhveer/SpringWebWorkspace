package Test;

import java.awt.*;

public class panelTest extends Panel {
    panelTest() {

    }

    public static void main(String[] args) {
        panelTest p = new panelTest();
        Frame f = new Frame("Test Panel");
        f.add(p);
        f.setSize(400, 500);
        f.setVisible(true);
    }
}
