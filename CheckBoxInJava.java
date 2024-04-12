import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxInJava {
    public static void main(String[] args) {
        
        // Jcheckbox = A GUI component that can be selected or deselected

        new MyFrame2();

    }
}

class MyFrame2 extends JFrame implements ActionListener{

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon yesIcon;

    MyFrame2(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("wrong.png");
        yesIcon = new ImageIcon("right.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        button.setFocusable(false);

        checkBox = new JCheckBox();
        checkBox.setText("I am not Robbot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("MV Boli", Font.BOLD, 20));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(yesIcon);

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
    }
    
}