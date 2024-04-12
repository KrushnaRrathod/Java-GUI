import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxesInJava {
    public static void main(String[] args) {

        // JcomboBoxes = A component that combines a button or editabel fields and a drop down list

        new MyFrame4();

    }
}

class MyFrame4 extends JFrame implements ActionListener{
    JComboBox comboBox;
    MyFrame4(){
        String animal[] = {"Jaguar","lion","Tiger"}; 
        comboBox = new JComboBox(animal);
        comboBox.addActionListener(this);

        // comboBox.setEditable(true);

        // System.out.println(comboBox.getItemCount()); 
        //comboBox.addItem("horse");

        // comboBox.insertItemAt("pig", 0); 
        //comboBox.setSelectedIndex(0);

        // comboBox.removeItem("cat"); 
        //comboBox.removeItemAt(0);
        // comboBox.removeAllItems();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(400, 400));
        this.add(comboBox);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
                System.out.println(comboBox.getSelectedItem());
        }
    }
}