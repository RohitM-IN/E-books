import javax.swing.*;    
public class ProgressBarExample extends JFrame{    
JProgressBar jb;    
int i=0,num=0;     
ProgressBarExample(){    
jb=new JProgressBar(0,2000);    
jb.setBounds(40,40,160,30);         
jb.setValue(0);    
jb.setStringPainted(true);    
add(jb);    
setSize(250,150);    
setLayout(null);    
}    
public void iterate(){    
while(i<=2000){    
  jb.setValue(i);    
  i=i+20;    
  try{Thread.sleep(150);}catch(Exception e){}    
}    
}    
public static void main(String[] args) {    
    ProgressBarExample m=new ProgressBarExample();    
    m.setVisible(true);    
    m.iterate();    
}    
}    