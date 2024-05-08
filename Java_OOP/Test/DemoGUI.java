package Test;

import java.awt.*;

public class DemoGUI extends Frame {
    TextField textField1 = new TextField(30);
    Label label1 = new Label("This is an Button!");
    Button button1 = new Button("Red");
    Button button2 = new Button("Blue");
    Button button3 = new Button("Green");
    Label label2 = new Label("CheckBoxes");
    Checkbox box1 = new Checkbox("Red", true);
    Checkbox box2 = new Checkbox("Green", true);
    Checkbox box3 = new Checkbox("Blue", true);
    Label label3 = new Label("Radio Buttons:");
    CheckboxGroup checkboxgr = new CheckboxGroup();
    Checkbox box4 = new Checkbox("Small", checkboxgr, true);
    Checkbox box5 = new Checkbox("Medium", checkboxgr, true);
    Checkbox box6 = new Checkbox("Large", checkboxgr, true);
    Label label4 = new Label("Choicetest");
    Choice colors = new Choice();
    DemoGUI(String title) {
        super(title);
        setLayout(new BorderLayout());
        add(textField1, BorderLayout.NORTH);
        add(label1, BorderLayout.CENTER);
        add(button1, BorderLayout.CENTER);
        add(button2, BorderLayout.CENTER);
        add(button3, BorderLayout.CENTER);
        add(label2, BorderLayout.CENTER);
        add(box1, BorderLayout.CENTER);
        add(box2, BorderLayout.CENTER);
        add(box3, BorderLayout.CENTER);
        add(label3, BorderLayout.CENTER);
        add(box4, BorderLayout.CENTER);
        add(box5, BorderLayout.CENTER);
        add(box6, BorderLayout.CENTER);
        add(label4, BorderLayout.CENTER);
        colors.addItem("White");
        colors.addItem("Red");
        colors.addItem("Orange");
        colors.addItem("Green");
        colors.addItem("Yellow");
        colors.addItem("Blue");
        colors.addItem("Black");
        add(colors);
    }

    public static void main(String args[]) {
        DemoGUI f = new DemoGUI("TextField");
        f.setSize(300, 200);
        f.setVisible(true);
    }
}