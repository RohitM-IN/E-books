import java.awt.BorderLayout;  
import java.awt.Container;  
import javax.swing.JButton;  
import javax.swing.JComboBox;  
import javax.swing.JFrame;  
import javax.swing.JScrollPane;  
import javax.swing.JTextArea;  
import javax.swing.JToolBar;  
  
public class JToolBarExample {  
    public static void main(final String args[]) {  
        JFrame myframe = new JFrame("JToolBar Example");  
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        JToolBar toolbar = new JToolBar();  
        toolbar.setRollover(true);  
        JButton button = new JButton("File");  
        toolbar.add(button);  
        toolbar.addSeparator();  
        toolbar.add(new JButton("Edit"));  
        toolbar.add(new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4" }));  
        Container contentPane = myframe.getContentPane();  
        contentPane.add(toolbar, BorderLayout.NORTH);  
        JTextArea textArea = new JTextArea();  
        JScrollPane mypane = new JScrollPane(textArea);  
        contentPane.add(mypane, BorderLayout.EAST);  
        myframe.setSize(450, 250);  
        myframe.setVisible(true);  
    }  
}  