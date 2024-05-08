package Test;

import java.awt.*;

public class DemoGUIWithDialog extends Frame {
    DemoGUIWithDialog(String title) {
        super(title);
    }

    public static void main(String args[]) {
        DemoGUIWithDialog f = new DemoGUIWithDialog("I have been Framed!!!");
        f.setSize(300, 200);
        f.setVisible(true);
        String titles = "Title";
        boolean modal = true;
        Dialog dig = new Dialog(f,titles,modal);
        dig.setSize(100, 200);
        dig.setVisible(true);
    }
}
