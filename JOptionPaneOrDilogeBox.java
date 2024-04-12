import javax.swing.JOptionPane;

public class JOptionPaneOrDilogeBox {
    public static void main(String[] args) {

        // JOptionPane = pop up a standerd dialog box that prompts users for a value
        // or informs them of something

        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.ERROR_MESSAGE);
        
        
        // System.out.println(JOptionPane.showConfirmDialog(null, "This is some useless info", "Title", JOptionPane.YES_NO_CANCEL_OPTION));

        // String name = JOptionPane.showInputDialog("What is your name? : ");
        // System.out.println(name);

        JOptionPane.showOptionDialog(null, "Krushna", "Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, args, args);
    }
}
