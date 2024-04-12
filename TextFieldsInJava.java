import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldsInJava {
    public static void main(String[] args) {

        // JtextFields = A GUI textbox that can be used to add, set, or get text

        new MyFrame1();
    }
}

class MyFrame1 extends JFrame implements ActionListener{

    JTextField text;
    JButton button;

    MyFrame1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this); 
        
        text = new JTextField();
        text.setPreferredSize(new Dimension(250, 40));
        
        this.add(button);
        this.add(text);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Hello"+text.getText());
        }
    }

}