package Hotel.management.system;

import javax.swing.*;

public class splash extends JFrame {
splash(){

   ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif")) ;
   JLabel label=new JLabel(imageicon);
   add(label);
   label.setBounds(0,0,858,680);
 setSize(858,680)   ;
 setVisible(true);
 setLocation(300,80);
 try{
     Thread.sleep(2000);
     setVisible(false);
     new Login();
 }catch(Exception e){
     e.printStackTrace();
 }
}
    public static void main(String[] args) {
        new splash();
    }
}