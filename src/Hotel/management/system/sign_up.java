package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class sign_up extends JFrame  {
    JTextField textField1;
    JPasswordField passwordField1;
    JButton button1,button2;
    sign_up(){
        JLabel label1=new JLabel("Username:");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        add(label1);
        JLabel label2=new JLabel("Password:");
        label2.setBounds(40,70 ,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.white);
        add(label2);

        textField1=new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField1.setBackground(new Color(36,104,110));
        add(textField1);

        passwordField1=new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setBackground(new Color(26,104,110));
        passwordField1.setForeground(Color.white);
        passwordField1.setFont(new Font("Tohama",Font.PLAIN,15));
        add(passwordField1);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        JLabel label=new JLabel(imageIcon);
        label.setBounds(315,-30,255,300);
        add(label);

        button1=new JButton("ADD");
        button1.setBounds(40,140,120,30);
        button1.setFont(new Font("serif",Font.BOLD,15));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    conncn c=new conncn();
                    String user=textField1.getText();
                    String pass=passwordField1.getText();
                    c.statement.executeUpdate("INSERT INTO login VALUES ('"+user+"','"+pass+"')");
                    JOptionPane.showMessageDialog(null,"Sign up Seccessfully");

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        button2=new JButton("Cancle");
        button2.setBounds(180,140,120,30);
        button2.setFont(new Font("serif",Font.BOLD,15));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    System.exit(143);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JButton button3=new JButton("CANCEL");
        button3.setBounds(180,140,120,30);
        button3.setFont(new Font("serif",Font.BOLD,15));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new sign_up();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });



        getContentPane().setBackground(new Color(3,45,48));
        setSize(600,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new sign_up();
    }
}

