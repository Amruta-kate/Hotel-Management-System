package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JPanel panel1 =new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i1=imageIcon.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(300,20,800,800);
        label.setLayout(null);
        panel.add(label);

        ImageIcon imageIcon11=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i11=imageIcon11.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon111=new ImageIcon(i11);
        JLabel label1=new JLabel(imageIcon111);
        label1.setBounds(5,530,250,250);
        label1.setLayout(null);
        panel1.add(label1);

        JButton btnNCF=new JButton("New costomer form");
        btnNCF.setBounds(30,40,200,30);
        btnNCF.setForeground(Color.WHITE);
        btnNCF.setBackground(Color.BLACK);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                  new new_costomer();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        JButton btnRoom=new JButton("Room");
        btnRoom.setBounds(30,80,200,30);
        btnRoom.setForeground(Color.WHITE);
        btnRoom.setBackground(Color.BLACK);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                 new room();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        JButton btnDepartment=new JButton("Department");
        btnDepartment.setBounds(30,120,200,30);
        btnDepartment.setForeground(Color.WHITE);
        btnDepartment.setBackground(Color.BLACK);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                new department();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JButton btnEmpInfo=new JButton("All Employee Info");
        btnEmpInfo.setBounds(30,160,200,30);
        btnEmpInfo.setForeground(Color.WHITE);
        btnEmpInfo.setBackground(Color.BLACK);
        panel1.add(btnEmpInfo);
        btnEmpInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                 new employees();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JButton btnCustomerInfo=new JButton("Customer Info");
        btnCustomerInfo.setBounds(30,200,200,30);
        btnCustomerInfo.setForeground(Color.WHITE);
        btnCustomerInfo.setBackground(Color.BLACK);
        panel1.add(btnCustomerInfo);
        btnCustomerInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
new customer();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JButton btnManagerInfo=new JButton("Manager Info");
        btnManagerInfo.setBounds(30,240,200,30);
        btnManagerInfo.setForeground(Color.WHITE);
        btnManagerInfo.setBackground(Color.BLACK);
        panel1.add(btnManagerInfo);
        btnManagerInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                new manager_info();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JButton btnCheckOut=new JButton("Check Out");
        btnCheckOut.setBounds(30,280,200,30);
        btnCheckOut.setForeground(Color.WHITE);
        btnCheckOut.setBackground(Color.BLACK);
        panel1.add(btnCheckOut);
        btnCheckOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                new check_out();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JButton btnSearchRoom=new JButton("Search Room");
        btnSearchRoom.setBounds(30,320,200,30);
        btnSearchRoom.setForeground(Color.WHITE);
        btnSearchRoom.setBackground(Color.BLACK);
        panel1.add(btnSearchRoom);
        btnSearchRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new search_room();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JButton back=new JButton(" Back");
        back.setBounds(70,360,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Dashboard();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        JButton log_out=new JButton(" Log_Out");
        log_out.setBounds(70,400,120,30);
        log_out.setForeground(Color.WHITE);
        log_out.setBackground(Color.BLACK);
        panel1.add(log_out);
        log_out.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                   System.exit(143);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       setSize(1950,1090);
       setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
