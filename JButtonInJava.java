import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JButtonInJava {
    public static void main(String[] args) {
        new MyJFrame();
    }
}

class MyJFrame extends JFrame implements ActionListener { //implements ActionListener
    
    JButton button;
    ImageIcon icon;
    JLabel label;

    MyJFrame(){

        icon = new ImageIcon("hand.jpg");
        label = new JLabel(icon);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(120, 100, 200, 200);
        // button.addActionListener(e -> System.out.println("Krushna")); // Using lamda exprassion
        button.addActionListener(this);
        button.setText("Krushna");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font("Comic Sens",Font.BOLD,20));
        button.setIconTextGap(-20);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Krushna");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
