package Hotel.management.system;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class add_room extends JFrame implements ActionListener {
JTextField t1,t4;
JComboBox t3,t5,t6;
JButton b1,b2;
    add_room(){
        setLayout(null);
    JPanel panel=new JPanel();
    panel.setBounds(5,5,875,490);
    panel.setBackground(new Color(3,45,48));
    panel.setLayout(null);
    add(panel);

    JLabel l1=new JLabel("ADD ROOM");
    l1.setBounds(194,10,160,22);
    l1.setFont(new Font("Tahoma",Font.BOLD,22));
    l1.setForeground(Color.WHITE);
    panel.add(l1);

    JLabel l2=new JLabel("Room number");
    l2.setBounds(64,70,152,22);
l2.setFont(new Font("Tahoma",Font.BOLD,14));
    l2.setForeground(Color.WHITE);
    panel.add(l2);

    t1=new JTextField();
    t1.setBounds(200,70,156,20);
    t1.setFont(new Font("Tahoma",Font.PLAIN,14));
    t1.setForeground(Color.WHITE);
    t1.setBackground(new Color(16,108,115));
    panel.add(t1);

    JLabel l3=new JLabel("Availability");
    l3.setBounds(64,110,152,22);
    l3.setFont(new Font("Tahoma",Font.BOLD,14));
    l3.setForeground(Color.WHITE);
    panel.add(l3);
        t3=new JComboBox(new String[]{"Available","Occupied"});
        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma",Font.PLAIN,14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);

        JLabel l4=new JLabel("Price");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4=new JTextField();
        t4.setBounds(200,150,156,20);
        t4.setFont(new Font("Tahoma",Font.PLAIN,14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16,108,115));
        panel.add(t4);

        JLabel l5=new JLabel("Clining Status");
        l5.setBounds(64,200,152,22);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5=new JComboBox(new String[]{"Cleaned","Dirty"});
        t5.setBounds(200,200,156,20);
        t5.setFont(new Font("Tahoma",Font.PLAIN,14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);

        JLabel l6=new JLabel("Bed Type");
        l6.setBounds(64,250,152,22);
        l6.setFont(new Font("Tahoma",Font.BOLD,14));
        l6.setForeground(Color.WHITE);
        panel.add(l6);

        t6=new JComboBox(new String[]{"Single Bed","Double Bed"});
        t6.setBounds(200,250,156,20);
        t6.setFont(new Font("Tahoma",Font.PLAIN,14));
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(16,108,115));
        panel.add(t6);

        b1=new JButton("ADD");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        panel.add(b1);
        b1.addActionListener(this);
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image i=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i);
        JLabel l=new JLabel(imageIcon1);
        l.setBounds(500,60,300,300);
        panel.add(l);

        b2=new JButton("BACK");
        b2.setBounds(198,321,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        panel.add(b2);
        b2.addActionListener(this);
setSize(885,500);
setUndecorated(true);
setVisible(true);

setLocation(20,200);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                conncn con = new conncn();
                String room_no = t1.getText();
                String Available = (String) t3.getSelectedItem();
                String price = t4.getText();
                String cleaning = (String) t5.getSelectedItem();
                String bed_stm = (String) t6.getSelectedItem();

                String q = "INSERT INTO room VALUES ('" + room_no + "','" + Available + "','" + price + "','" + cleaning + "','" + bed_stm + "')";
                con.statement.executeUpdate(q);

               JOptionPane.showMessageDialog(null,"Room added Successfully");

            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }else{
        new admin();
        setVisible(false);
        }
    }
    public static void main(String[] args) {
        new add_room();
    }
}
