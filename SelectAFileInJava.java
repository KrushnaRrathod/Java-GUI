import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class SelectAFileInJava {
    public static void main(String[] args) {
        // JFileChooser = A GUI mechanism that lets a user choose a file (Helpful for opening oe saving files)
        new MyFrame6();
    }
}

class MyFrame6 extends JFrame implements ActionListener{

    JButton button;

    MyFrame6(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));
            // chooser.showOpenDialog(null); // select file to open
            // System.out.println(chooser.showOpenDialog(null));

            int responce = chooser.showOpenDialog(null);
            if(responce==JFileChooser.APPROVE_OPTION){
                File file = new File(chooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
    
}