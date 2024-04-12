import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonsInJava {
    public static void main(String[] args) {
        // JRadioButton = One or more Button in grouping in which only one may be selected per group

        new MyFrmae3();
    }
}

class MyFrmae3 extends JFrame implements ActionListener{
    JRadioButton pizzRadioButton;
    JRadioButton hamBurgurRadioButton;
    JRadioButton hotDogRadioButton;
    MyFrmae3(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        pizzRadioButton = new JRadioButton("Pizza");
        pizzRadioButton.setFocusable(false);
        pizzRadioButton.addActionListener(this);
        hamBurgurRadioButton= new JRadioButton("HamBurger");
        hamBurgurRadioButton.setFocusable(false);
        hotDogRadioButton = new JRadioButton("HotDog");
        hamBurgurRadioButton.addActionListener(this);
        hotDogRadioButton.setFocusable(false);
        hotDogRadioButton.addActionListener(this);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizzRadioButton);
        buttonGroup.add(hamBurgurRadioButton);
        buttonGroup.add(hotDogRadioButton);
        this.add(pizzRadioButton);
        this.add(hamBurgurRadioButton);
        this.add(hotDogRadioButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzRadioButton){
            System.out.println("You ordered Pizza");
        }else if(e.getSource()==hamBurgurRadioButton){
            System.out.println("you ordered HamBurger");
        }else if(e.getSource()==hotDogRadioButton){
            System.out.println("You ordered HotDog");
        }
    }
}
