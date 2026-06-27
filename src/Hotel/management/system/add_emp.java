package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class add_emp extends JFrame implements ActionListener {

    JTextField tName, tAge, tSalary, tPhone, tAadhar, tEmail;
    JRadioButton r1, r2;
    JComboBox<String> cbJob;
    JButton save, back;

    add_emp() {

        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 850, 540);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel heading = new JLabel("ADD EMPLOYEE DETAILS");
        heading.setBounds(250, 20, 400, 35);
        heading.setFont(new Font("Tahoma", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        panel.add(heading);

        Font labelFont = new Font("Tahoma", Font.BOLD, 16);

        // NAME
        JLabel l1 = new JLabel("NAME");
        l1.setBounds(60, 80, 120, 25);
        l1.setFont(labelFont);
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        tName = new JTextField();
        tName.setBounds(200, 80, 160, 25);
        panel.add(tName);

        // AGE
        JLabel l2 = new JLabel("AGE");
        l2.setBounds(60, 130, 120, 25);
        l2.setFont(labelFont);
        l2.setForeground(Color.WHITE);
        panel.add(l2);

        tAge = new JTextField();
        tAge.setBounds(200, 130, 160, 25);
        panel.add(tAge);

        // GENDER
        JLabel l3 = new JLabel("GENDER");
        l3.setBounds(60, 180, 120, 25);
        l3.setFont(labelFont);
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        r1 = new JRadioButton("Male");
        r1.setBounds(200, 180, 80, 25);
        r1.setBackground(new Color(3, 45, 48));
        r1.setForeground(Color.WHITE);

        r2 = new JRadioButton("Female");
        r2.setBounds(290, 180, 100, 25);
        r2.setBackground(new Color(3, 45, 48));
        r2.setForeground(Color.WHITE);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        panel.add(r1);
        panel.add(r2);

        // JOB
        JLabel l4 = new JLabel("JOB");
        l4.setBounds(60, 230, 120, 25);
        l4.setFont(labelFont);
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        cbJob = new JComboBox(new String[]{
                "Manager",
                "Receptionist",
                "Kitchen Staff",
                "Room Service",
                "Chef"
        });

        cbJob.setBounds(200, 230, 160, 25);
        panel.add(cbJob);

        // SALARY
        JLabel l5 = new JLabel("SALARY");
        l5.setBounds(60, 280, 120, 25);
        l5.setFont(labelFont);
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        tSalary = new JTextField();
        tSalary.setBounds(200, 280, 160, 25);
        panel.add(tSalary);

        // PHONE
        JLabel l6 = new JLabel("PHONE");
        l6.setBounds(60, 330, 120, 25);
        l6.setFont(labelFont);
        l6.setForeground(Color.WHITE);
        panel.add(l6);

        tPhone = new JTextField();
        tPhone.setBounds(200, 330, 160, 25);
        panel.add(tPhone);

        // AADHAR
        JLabel l7 = new JLabel("AADHAR");
        l7.setBounds(60, 380, 120, 25);
        l7.setFont(labelFont);
        l7.setForeground(Color.WHITE);
        panel.add(l7);

        tAadhar = new JTextField();
        tAadhar.setBounds(200, 380, 160, 25);
        panel.add(tAadhar);

        // EMAIL
        JLabel l8 = new JLabel("EMAIL");
        l8.setBounds(60, 430, 120, 25);
        l8.setFont(labelFont);
        l8.setForeground(Color.WHITE);
        panel.add(l8);

        tEmail = new JTextField();
        tEmail.setBounds(200, 430, 160, 25);
        panel.add(tEmail);

        // BUTTONS
        back = new JButton("BACK");
        back.setBounds(80, 490, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(this);

        save = new JButton("SAVE");
        save.setBounds(240, 490, 120, 30);
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        panel.add(save);
        save.addActionListener(this);
        // IMAGE
        ImageIcon icon = new ImageIcon(
                ClassLoader.getSystemResource("icon/addemp.png")
        );

        Image img = icon.getImage()
                .getScaledInstance(250, 250, Image.SCALE_DEFAULT);

        JLabel imageLabel = new JLabel(new ImageIcon(img));
        imageLabel.setBounds(500, 120, 250, 250);
        panel.add(imageLabel);

        setSize(870, 570);
        setLocation(300, 100);
        setUndecorated(true);
        setVisible(true);
    }
@Override
public void actionPerformed(ActionEvent e){
    if(e.getSource()==save){
        try{
            conncn con=new conncn();
            String name=tName.getText();
            String Age =tAge.getText();
            String salary=tSalary.getText();
            String phone=tPhone.getText();
            String aadhar=tAadhar.getText();
            String email=tEmail.getText();
            String job=(String) cbJob.getSelectedItem();
            String gender=" ";
            if(r1.isSelected()){
                gender="Male";
            }
            else{
                gender="female";
            }
            String q="INSERT INTO employees VALUES('" + name +"','" + Age + "','" + gender + "','" + job  + "','" + salary + "','" + phone +"','" + aadhar  + "','" + email + "')";
                    con.statement.executeUpdate(q);
                    JOptionPane.showMessageDialog(null,"added employee");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }else{
        new admin();
    }
}
    public static void main(String[] args) {
        new add_emp();
    }
}
