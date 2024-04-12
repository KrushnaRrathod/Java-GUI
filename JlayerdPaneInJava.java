import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JlayerdPaneInJava {
    public static void main(String[] args) {

        // JlayerdPaneInJava = Swing container that provides a
        //                     third dimention for positioning components
        //                     ex. depth, Z-index

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);
        
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        // layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER); ---> we can also use this 
        layeredPane.add(label1, Integer.valueOf(0)); // using wrapper class we can change stack
        layeredPane.add(label2, Integer.valueOf(2)); // using wrapper class we can change stack
        layeredPane.add(label3, Integer.valueOf(1)); // using wrapper class we can change stack
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layeredPane);
        
    }
}
