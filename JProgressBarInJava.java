import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarInJava {
    public static void main(String[] args) {

        // Progress bar = Visual aid to let the user know that an operation is processing
        new ProgressBarDemo();
    }
}

class ProgressBarDemo{

    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar();

    ProgressBarDemo(){

        progressBar.setValue(0);
        progressBar.setBounds(0, 0, 420, 50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV Boli",Font.BOLD, 25));
        progressBar.setForeground(Color.red);

        frame.add(progressBar);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();
    }
    public void fill(){
        int counter = 0;
        while(counter<=100){
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter+=1;
        }
        progressBar.setString("Done!");
    }
}
