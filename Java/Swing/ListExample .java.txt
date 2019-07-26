import javax.swing.*;  
import java.awt.event.*;  
public class ListExample  
{  
     ListExample(){  
        JFrame f= new JFrame();  
        final JLabel label = new JLabel();          
        label.setSize(500,100);  
        JButton b=new JButton("Show");  
        b.setBounds(200,150,80,30);  
        final DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("C");  
          l1.addElement("C++");  
          l1.addElement("Java");  
          l1.addElement("PHP");  
          final JList<String> list1 = new JList<>(l1);  
          list1.setBounds(100,100, 75,75);  
          DefaultListModel<String> l2 = new DefaultListModel<>();  
          l2.addElement("Turbo C++");  
          l2.addElement("Struts");  
          l2.addElement("Spring");  
          l2.addElement("YII");  
          final JList<String> list2 = new JList<>(l2);  
          list2.setBounds(100,200, 75,75);  
          f.add(list1); f.add(list2); f.add(b); f.add(label);  
          f.setSize(450,450);  
          f.setLayout(null);  
          f.setVisible(true);  
          b.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) {   
                 String data = "";  
                 if (list1.getSelectedIndex() != -1) {                       
                    data = "Programming language Selected: " + list1.getSelectedValue();   
                    label.setText(data);  
                 }  
                 if(list2.getSelectedIndex() != -1){  
                    data += ", FrameWork Selected: ";  
                    for(Object frame :list2.getSelectedValues()){  
                       data += frame + " ";  
                    }  
                 }  
                 label.setText(data);  
              }  
           });   
     }  
public static void main(String args[])  
    {  
   new ListExample();  
    }}  