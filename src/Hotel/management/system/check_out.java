package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class check_out extends JFrame {
    JButton b1,b2,b3;
    check_out(){
      JPanel panel=new JPanel()  ;
      panel.setBounds(5,5,790,390);
      panel.setBackground(new Color(3,45,48));
      panel.setLayout(null);
      add(panel);

  JLabel label=new JLabel("Check_Out");
  label.setBounds(100,20,100,30);
  label.setFont(new Font("Tahoma",Font.BOLD,20));
  label.setForeground(Color.WHITE);
  panel.add(label);

        JLabel label1=new JLabel("Costumer_Id");
        label1.setBounds(30,80,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

    Choice customer=new Choice();
    customer.setBounds(200,80,150,25);
    panel.add(customer);

        JLabel label2=new JLabel("Room_No");
        label2.setBounds(30,130,150,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JLabel label3=new JLabel();
        label3.setBounds(200,130,150,30);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JLabel label4=new JLabel("Check_In time");
        label4.setBounds(30,180,150,30);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JLabel label5=new JLabel();
        label5.setBounds(200,180,150,30);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JLabel label6=new JLabel("Check_Out time");
        label6.setBounds(30,230,150,30);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        Date date=new Date();


        JLabel label7=new JLabel(""+date);
        label7.setBounds(200,230,200,30);
        label7.setFont(new Font("Tahoma",Font.BOLD,14));
        label7.setForeground(Color.WHITE);
        panel.add(label7);
   try{
       conncn con=new conncn();
       ResultSet rs=con.statement.executeQuery("SELECT * FROM customer");
       while(rs.next()){
           customer.add(rs.getString("number"));
       }
   } catch (Exception e) {
       throw new RuntimeException(e);
   }

   b1=new JButton("Check_Out");
   b1.setBounds(30,300,128,30);
   b1.setForeground(Color.WHITE);
   b1.setBackground(Color.BLACK);
   panel.add(b1);
   b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try{
                   conncn con = new conncn();

                   con.statement.executeUpdate(
                           "UPDATE room SET availability='Available' WHERE room_number='"+label3.getText()+"'"
                   );

                   con.statement.executeUpdate(
                           "DELETE FROM customer WHERE number='"+customer.getSelectedItem()+"'"
                   );

                   JOptionPane.showMessageDialog(null,"Check_Out Done...");
                   setVisible(false);

               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }
       });

        b2=new JButton("Check");
        b2.setBounds(300,300,128,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        panel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               conncn con =new conncn();
               try{
                    ResultSet rs=con.statement.executeQuery("SELECT * FROM customer WHERE number='"+customer.getSelectedItem()+"'");
                    while(rs.next()){
                        label3.setText(rs.getString("room"));
                        label5.setText((rs.getString("checked_in")));
                    }
               } catch (Exception ex) {
                   throw new RuntimeException(ex);
               }
            }
        });

        b3=new JButton("Back");
        b3.setBounds(170,300,128,30);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        panel.add(b3);
        setLayout(null);
      setSize(800,400);
      setLocation(500,210);
      setVisible(true);
    }

    public static void main(String[] args) {
        new check_out();
    }
}
