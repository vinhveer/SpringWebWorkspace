package Test;

import java.awt.*;
import java.awt.event.*;

public class evtTest extends Frame implements ActionListener {
    Label label = new Label("Enter a number");
    TextField textfield1 = new TextField(5);
    TextField textfield2 = new TextField(5);
    Button btnResult = new Button("Double is ");
    Button ext = new Button("exit");
    public evtTest(String title) {
        super(title);
        setLayout(new FlowLayout());
        btnResult.addActionListener(this);
        ext.addActionListener(this);
        add(label);
        add(textfield1);
        add(btnResult);
        add(textfield2);
        add(ext);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnResult) {
            int num = Integer.parseInt(textfield1.getText())*2;
            textfield2.setText(String.valueOf(num));
        }
        if (ae.getSource() == ext) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        evtTest t = new evtTest("Event handing");
        t.setSize(400, 500);
        t.show();
    }
}
