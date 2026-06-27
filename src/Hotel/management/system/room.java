package Hotel.management.system;

import com.mysql.cj.xdevapi.Table;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class room extends JFrame implements ActionListener {
    JTable table;
    JButton b;
    room(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image i=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        table=new JTable();
        table.setBounds(10,60,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            conncn con=new conncn();
            String q="SELECT * FROM room";
            ResultSet rs=con.statement.executeQuery(q);
           table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        b=new JButton("Back");
        b.setBounds(200,500,120,30);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        panel.add(b);
        b.addActionListener(this);

        JLabel room=new JLabel("Room no");
        room.setBounds(12,15,80,19);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(room);
        JLabel availability=new JLabel("Availability");
        availability.setBounds(119,15,80,19);
        availability.setForeground(Color.WHITE);
        availability.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(availability);
        JLabel clean=new JLabel("Clean status");
        clean.setBounds(216,15,150,19);
        clean.setForeground(Color.WHITE);
        clean.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(clean);
        JLabel price=new JLabel("price");
        price.setBounds(330,15,80,19);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);
        JLabel bed=new JLabel("Bed");
        bed.setBounds(417,15,80,19);
        bed.setForeground(Color.WHITE);
        bed.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(bed);


        setLayout(null);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true);
    }
@Override
public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            setVisible(false);
        }
}
    public static void main(String[] args) {
        new room();
    }
}
