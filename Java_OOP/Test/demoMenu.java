package Test;

import java.awt.*;
import java.awt.event.*;

public class demoMenu extends Frame implements ActionListener, MouseListener {
    MenuItem exitItem;
    PopupMenu optionsMenu;
    Frame frame;

    public demoMenu() {
        setTitle("Menu Example");
        setSize(300, 200);

        MenuBar mBar = new MenuBar();
        setMenuBar(mBar);

        // File menu
        Menu fileMenu = new Menu("Tep");
        mBar.add(fileMenu);
        fileMenu.addActionListener(this);
        MenuItem newItem = new MenuItem("Tao Moi");
        fileMenu.add(newItem);
        MenuItem openItem = new MenuItem("Mo");
        fileMenu.add(openItem);

        fileMenu.addSeparator();

        MenuItem saveItem = new MenuItem("Luu");
        fileMenu.add(saveItem);
        MenuItem saveAsItem = new MenuItem("Luu vao");
        fileMenu.add(saveAsItem);
        
        fileMenu.addSeparator();

        exitItem = new MenuItem("Thoat");
        fileMenu.add(exitItem);
        saveAsItem.addActionListener(this);

        // Edit menu
        Menu editMenu = new Menu("Sua");
        mBar.add(editMenu);
        editMenu.addActionListener(this);
        MenuItem cutItem = new MenuItem("Cat");
        editMenu.add(cutItem);
        MenuItem copyItem = new MenuItem("Sao chep");
        editMenu.add(copyItem);
        MenuItem pasteItem = new MenuItem("Dan");
        editMenu.add(pasteItem);

        editMenu.addSeparator();
        
        // Help menu
        Menu helpMenu = new Menu("Tro giup");
        mBar.add(helpMenu);
        helpMenu.addActionListener(this);
        MenuItem contentItem = new MenuItem("Noi dung");
        helpMenu.add(contentItem);
        MenuItem indexItem = new MenuItem("Muc luc");
        helpMenu.add(indexItem);
        // Find menu (In Help menu)
        Menu findMenu = new Menu("Tim");
        helpMenu.add(findMenu);
        addMouseListener(this);
        MenuItem nameItem = new Menu("Tim bang ten");
        findMenu.add(nameItem);
        MenuItem cacheItem = new Menu("Tim trong cache");
        findMenu.add(cacheItem);

        // Popup menu
        // Option menu
        optionsMenu = new PopupMenu("Options");
        editMenu.add(optionsMenu);
        optionsMenu.addActionListener(this);
        MenuItem readItem = new MenuItem("Read Only");
        optionsMenu.add(readItem);
        optionsMenu.addSeparator();

        // Format Menu
        Menu formatMenu = new Menu("Format text");
        optionsMenu.add(formatMenu);
        this.add(optionsMenu);
        formatMenu.addActionListener(this);
        CheckboxMenuItem insertItem = new CheckboxMenuItem("Insert", true);
        formatMenu.add(insertItem);
        CheckboxMenuItem overtypeItem = new CheckboxMenuItem("Overtype", false);
        formatMenu.add(overtypeItem);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public void mouseEntered(MouseEvent m) {}
    public void mouseExited(MouseEvent m) {}
    public void mouseClicked(MouseEvent m) {
        optionsMenu.show(this, m.getX(), m.getY());
    }
    public void mouseReleased(MouseEvent m) {} 
    public void mousePressed(MouseEvent m) {}
    public static void main(String[] args) {
        demoMenu frame = new demoMenu();
        frame.show();
    }
}
