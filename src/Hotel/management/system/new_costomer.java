package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.*;
public class new_costomer extends JFrame implements ActionListener {
    JComboBox combobox;
    JRadioButton r1,r2;
    Choice c1;
    JLabel date;
    JButton b1,b2;
    JTextField t1,t4,t6,t8;
    new_costomer(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image i1=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(550,150,200,200);
        panel.add(label);

        JLabel label1=new JLabel("NEW COSTOMER FORM");
        label1.setBounds(118,11,260,53);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2=new JLabel("ID :");
        label2.setBounds(35,76,200,14);
        label2.setFont(new Font("Tahoma",Font.PLAIN,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        combobox=new JComboBox(new String[]{"Passport","vote card","Aadhar"});
        combobox.setBounds(271,73,150,20);
        combobox.setForeground(Color.WHITE);
        combobox.setBackground(new Color(3,45,48));
        combobox.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(combobox);

        JLabel label3=new JLabel("No :");
        label3.setBounds(35,111,200,14);
        label3.setFont(new Font("Tahoma",Font.PLAIN,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        t1=new JTextField();
        t1.setBounds(271,111,150,20);
        panel.add(t1);

        JLabel label4=new JLabel("Name :");
        label4.setBounds(35,151,200,14);
        label4.setFont(new Font("Tahoma",Font.PLAIN,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        t4=new JTextField();
        t4.setBounds(271,151,150,20);
        panel.add(t4);

        JLabel label5=new JLabel("Gender :");
        label5.setBounds(35,191,200,14);
        label5.setFont(new Font("Tahoma",Font.PLAIN,14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(3,45,48));
        r1.setBounds(271,191,80,12);
        panel.add(r1);

        r2=new JRadioButton("female");
        r2.setFont(new Font("Tahoma",Font.BOLD,14));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(3,45,48));
        r2.setBounds(350,191,80,12);
        panel.add(r2);

        JLabel label6=new JLabel("Country :");
        label6.setBounds(35,231,200,14);
        label6.setFont(new Font("Tahoma",Font.PLAIN,14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        t6=new JTextField();
        t6.setBounds(271,231,150,20);
        panel.add(t6);
        JLabel label7=new JLabel("Room no :");
        label7.setBounds(35,281,200,14);
        label7.setFont(new Font("Tahoma",Font.PLAIN,14));
        label7.setForeground(Color.WHITE);
        panel.add(label7);
        c1=new Choice();
        try{
            conncn con=new conncn();
            ResultSet rs=con.statement.executeQuery("SELECT * FROM room WHERE availability='Available'");
            while(rs.next()){
                c1.add(rs.getString("room_number"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }                                                             //choiceeeeeeeeeeeee
        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3,45,48));
        panel.add(c1);

        JLabel label11=new JLabel("Checked In :");
        label11.setBounds(35,316,200,14);
        label11.setFont(new Font("Tahoma",Font.PLAIN,14));
        label11.setForeground(Color.WHITE);
        panel.add(label11);

        Date date1=new Date();

        date=new JLabel(""+date1);                                     //Dateeeeeeeeeeee
        date.setBounds(271,316,200,24);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("tahoma",Font.PLAIN,14));
        panel.add(date);

        JLabel label8=new JLabel("Deposit :");
        label8.setBounds(35,359,200,14);
        label8.setFont(new Font("Tahoma",Font.PLAIN,14));
        label8.setForeground(Color.WHITE);
        panel.add(label8);

     t8=new JTextField();
        t8.setBounds(271,359,150,20);
        panel.add(t8);

        b1=new JButton("ADD");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,430,120,30);
        b1.setFont(new Font("Tohama",Font.PLAIN,15));
        panel.add(b1);
        b1.addActionListener(this);
        b2=new JButton("BACK");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(260,430,120,30);
        b2.setFont(new Font("Tohama",Font.PLAIN,15));
        panel.add(b2);
        b2.addActionListener(this);

        setLayout(null);
        setSize(850,550);
        setLocation(500,150);
        setVisible(true);
    }
@Override
public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try{
conncn con=new conncn();
String ID=(String)combobox.getSelectedItem();
String NO=t1.getText();
String name=t4.getText();
                String gender="";

                if(r1.isSelected()){

                    gender="Male";

                }
                else if(r2.isSelected()){

                    gender="Female";

                }
String country=t6.getText();

String rno=(String) c1.getSelectedItem();
String check_In_time= date.getText();
String deposit=t8.getText();
String q="INSERT INTO customer VALUES('" + ID +"','" + NO + "','" + name + "','" + gender  + "','" + country + "','" + rno +"','" + check_In_time  + "','" + deposit + "')";
String q1="update room SET availability='Occupied' WHERE room_number='"+c1.getSelectedItem()+"'";

                con.statement.executeUpdate(q);
                con.statement.executeUpdate(q1);
JOptionPane.showMessageDialog(null,"Add customer");


            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }else{
            setVisible(false);
        }
}
    public static void main(String[] args) {
        new new_costomer();
    }
}
