import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColourChooserInJava {
    public static void main(String[] args) {
        // JColorChooser = A GUI machanism that lets a user choose a colour
        new MyFrame7();
    }
}   

class MyFrame7 extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame7(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Chose a Color");
        button.setFocusable(false);
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("Krushna Rathod");
        label.setFont(new Font("MV Boli", Font.ITALIC, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();  

            Color color = JColorChooser.showDialog(null,"Pick a Co;or", Color.BLACK); 

            label.setForeground(color);
        }
    }
}
