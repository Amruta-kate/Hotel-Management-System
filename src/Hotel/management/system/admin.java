package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {
    JButton add_emp,add_room,add_driver,logout,back;
    admin(){
        ImageIcon imageIcon2=new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i1=imageIcon2.getImage().getScaledInstance(120,100,Image.SCALE_DEFAULT);
        ImageIcon imageIcon22=new ImageIcon(i1);
        JLabel label1=new JLabel(imageIcon22);
        label1.setBounds(100,180,120,100);
        add(label1);
        ImageIcon imageIcon3=new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image i2=imageIcon3.getImage().getScaledInstance(120,100,Image.SCALE_DEFAULT);
        ImageIcon imageIcon33=new ImageIcon(i2);
        JLabel label2=new JLabel(imageIcon33);
        label2.setBounds(100,320,120,100);
        add(label2);
        ImageIcon imageIcon4=new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image i3=imageIcon4.getImage().getScaledInstance(120,100,Image.SCALE_DEFAULT);
        ImageIcon imageIcon44=new ImageIcon(i3);
        JLabel label3=new JLabel(imageIcon44);
        label3.setBounds(100,460,120,100);
        add(label3);




        add_emp=new JButton("ADD EMPLOYEE");
        add_emp.setBounds(300,230,200,20);
        add_emp.setBackground(Color.WHITE);
        add_emp.setForeground(Color.BLACK);
        add_emp.setFont(new Font("Tahona",Font.BOLD,16));
        add(add_emp);
        add_emp.addActionListener(this);

        add_room=new JButton("ADD ROOM");
        add_room.setBounds(300,370,200,20);
        add_room.setBackground(Color.WHITE);
        add_room.setForeground(Color.BLACK);
        add_room.setFont(new Font("Tahona",Font.BOLD,16));
        add(add_room);
        add_room.addActionListener(this);

        add_driver=new JButton("ADD DRIVER");
        add_driver.setBounds(300,490,200,20);
        add_driver.setBackground(Color.WHITE);
        add_driver.setForeground(Color.BLACK);
        add_driver.setFont(new Font("Tahona",Font.BOLD,16));
        add(add_driver);
        add_driver.addActionListener(this);

        logout=new JButton("LOG OUT");
        logout.setBounds(10,750,100,20);
        logout.setFont(new Font("Tahoma",Font.PLAIN,15));
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        add(logout);
        logout.addActionListener(this);

        back=new JButton("BACK");
        back.setBounds(120,750,100,20);
        back.setFont(new Font("Tahoma",Font.PLAIN,15));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        back.addActionListener(this);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i=imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(1100,240,255,300);
        add(label);

       getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

    }
@Override
public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==add_emp){
                new add_emp();
            } else if (e.getSource()==add_room) {
              new add_room();
            } else if (e.getSource()==add_driver) {
                new add_driver();
            }  if (e.getSource()==logout) {
                System.exit(143);
            } else if (e.getSource()==back) {
                new Dashboard();
              setVisible(false);
            }
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
}
    public static void main(String[] args) {
        new admin();
    }
}
