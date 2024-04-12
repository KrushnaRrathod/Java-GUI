import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLableInJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Creating Jframe
        ImageIcon icon = new ImageIcon("download.jpg");
        ImageIcon icon1 = new ImageIcon("bro.png");
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.red,5);
        
        label.setText("Krushna Rathod");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red);
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); 
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setIconTextGap(0);
        label.setBorder(border);
        label.setBounds(0, 0, 350, 350);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        frame.setIconImage(icon1.getImage());
        frame.setResizable(true);
        frame.setTitle("Amazing");
        frame.add(label); // Adding lable to frame
        frame.setLayout(null);
        // frame.pack();        
    }
}
