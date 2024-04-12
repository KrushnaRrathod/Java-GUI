import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyLisnerinJava {
    public static void main(String[] args) {
        new MyFrame8();
    }
}

class MyFrame8 extends JFrame implements KeyListener{

    JLabel label;

    MyFrame8(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keyType = Invoke when a physical key is typed. Uses KeyChar, char Output

        switch(e.getKeyChar()){
            case 'a' : label.setLocation(label.getX()-1, label.getY());
            break;
            case 'w' : label.setLocation(label.getX(), label.getY()-1);
            break;  
            case 's' : label.setLocation(label.getX(), label.getY()+1);
            break;
            case 'd' : label.setLocation(label.getX()+1, label.getY());
            break;

        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // kryPressed = Invoke when a physical key is pressed down. Users KeyCode, int output.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased = Called whenever a button is relesed

        System.out.println("You relesed key char : "+e.getKeyChar());
        System.out.println("You relesed key char : "+e.getKeyCode());
    }
    
}
