package Test;

import java.awt.*;

public class textArea extends Frame {
    Label label = new Label("Details");
    TextArea textArea1 = new TextArea();
    public textArea(String title) {
        super(title);
        setLayout(new FlowLayout());
        add(label);
        add(textArea1);
    }

    public static void main(String args[]) {
        textArea t = new textArea("TextArea");
        t.setSize(500, 700);
        t.show();
    }
}
