import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JframeInJava {
    public static void main(String[] args) {
        MyJFrame frame = new MyJFrame();
        frame.jframeMethod(); // Calling JFrame Using Method
    }
}

class MyJFrame extends JFrame{  
    public void jframeMethod(){
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("bro.png");
        

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setIconImage(icon.getImage());
        frame.setTitle("KRUSHANA");
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.getContentPane().setBackground(new Color( 255, 0, 0));
        frame.getContentPane().setBackground(new Color((0xfffff)));
    }
}