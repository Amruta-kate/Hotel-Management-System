package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class search_room extends JFrame implements ActionListener {
    JButton b;
    search_room(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table =new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            conncn con=new conncn();
            String q="SELECT * FROM room WHERE availability='Available'";
            ResultSet rs=con.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        b=new JButton("Back")    ;
        b.setBounds(400,410,120,30);
        b.setForeground(Color.WHITE);
        b.setBackground(Color.BLACK);
        panel.add(b);
        b.addActionListener(this);
        setLayout(null);
        setSize(700,500);
        setLocation(550,150);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            try{
                setVisible(false);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }

    }
    public static void main(String[] args) {
        new search_room();
    }
}
