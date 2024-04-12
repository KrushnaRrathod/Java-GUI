import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class MenubarInJava {
    public static void main(String[] args) {
        new MyFrame5();
    }
}

class MyFrame5 extends JFrame implements ActionListener{
    JMenuBar mBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem  saveItem;
    JMenuItem exitItem;
    MyFrame5(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        
        mBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        fileMenu.setMnemonic(KeyEvent.VK_F);;
        editMenu.setMnemonic(KeyEvent.VK_E);;
        helpMenu.setMnemonic(KeyEvent.VK_H);;

        mBar.add(fileMenu);
        mBar.add(editMenu);
        mBar.add(helpMenu);
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit ");
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        
        this.setJMenuBar(mBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {    
        if(e.getSource()==loadItem){
            System.out.println("Load");
        }else if(e.getSource()==saveItem){
            System.out.println("Save");
        }else if(e.getSource()==exitItem){
            System.out.println("Exit");
        }
    }
}