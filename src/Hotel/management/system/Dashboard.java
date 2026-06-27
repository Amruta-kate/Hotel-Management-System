package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add,rec;
    public Dashboard(){
        super("HOTEL MANAGEMENT SYSTEM");

        rec=new JButton("RECEPTION");
        rec.setBounds(425,510,140,30);
        rec.setForeground(Color.WHITE);
        rec.setFont(new Font("Tahona",Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.addActionListener(this);
        add(rec);
        add=new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setForeground(Color.WHITE);
        add.setFont(new Font("Tahona",Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.addActionListener(this);
        add(add);

        ImageIcon imageIcon11=new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i11=imageIcon11.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon111=new ImageIcon(i11);
        JLabel label1 =new JLabel(imageIcon111);
        label1.setBounds(850,300,200,195);
        add(label1);

        ImageIcon imageIcon2=new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i2=imageIcon2.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3=new ImageIcon(i2);
        JLabel label2=new JLabel(imageIcon3);
        label2.setBounds(400,300,200,195);
        add(label2);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
         Image i1=imageIcon.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
         ImageIcon imageIcon1=new ImageIcon(i1);
         JLabel label=new JLabel(imageIcon1);
         label.setBounds(0,0,1950,1090);
         add(label);
        setSize(1950,1090);
        setLayout(null);
        setVisible(true);
    }
@Override
public void actionPerformed(ActionEvent e){
    if(e.getSource()==rec){
        new Reception();
    }else{
       new Admin_login() ;
    }
}
    public static void main(String[] args) {
        new Dashboard();
    }
}
