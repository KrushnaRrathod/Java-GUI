import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelsInJava{
    public static void main(String[] args) {
        // JPanels = a GUI components that function as a container to hold other components

        JFrame frame = new JFrame();

        ImageIcon icon = new ImageIcon("up.png");

        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        JLabel label = new JLabel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        
        label.setText("Hii");
        // label.setIcon(icon);
        // label.setHorizontalTextPosition(JLabel.CENTER);
        // label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.green);
        label.setFont(new Font("MI Boli", Font.PLAIN, 20));
        
        label1.setText("Hii");
        label1.setIcon(icon);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setForeground(Color.green);
        label1.setFont(new Font("MI Boli", Font.PLAIN, 20));
        
        label2.setText("Hii");
        label2.setIcon(icon);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.CENTER);
        label2.setForeground(Color.green);
        label2.setFont(new Font("MI Boli", Font.PLAIN, 20));

        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 400, 400);
        redPanel.add(label);
        // redPanel.setLayout(new BorderLayout());
        
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(400, 0, 400, 400);
        bluePanel.add(label1);
        
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 400,800, 400);
        greenPanel.add(label2);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}