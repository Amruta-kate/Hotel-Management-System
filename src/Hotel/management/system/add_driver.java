package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class add_driver extends JFrame implements ActionListener {

    JTextField tName, tAge, tCompany, tCarName, tLocation;
    JComboBox<String> cbGender, cbAvailable;
    JButton add, back;

    add_driver() {

        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 850, 500);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel heading = new JLabel("Add Drivers");
        heading.setBounds(250, 20, 250, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        panel.add(heading);

        Font font = new Font("Tahoma", Font.BOLD, 14);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(60, 80, 120, 25);
        l1.setForeground(Color.WHITE);
        l1.setFont(font);
        panel.add(l1);

        tName = new JTextField();
        tName.setBounds(180, 80, 165, 25);
        panel.add(tName);

        JLabel l2 = new JLabel("Age");
        l2.setBounds(60, 125, 120, 25);
        l2.setForeground(Color.WHITE);
        l2.setFont(font);
        panel.add(l2);

        tAge = new JTextField();
        tAge.setBounds(180, 125, 165, 25);
        panel.add(tAge);

        JLabel l3 = new JLabel("Gender");
        l3.setBounds(60, 170, 120, 25);
        l3.setForeground(Color.WHITE);
        l3.setFont(font);
        panel.add(l3);

        cbGender = new JComboBox<>(new String[]{"Male", "Female"});
        cbGender.setBounds(180, 170, 165, 25);
        panel.add(cbGender);

        JLabel l4 = new JLabel("Car Company");
        l4.setBounds(60, 215, 120, 25);
        l4.setForeground(Color.WHITE);
        l4.setFont(font);
        panel.add(l4);

        tCompany = new JTextField();
        tCompany.setBounds(180, 215, 165, 25);
        panel.add(tCompany);

        JLabel l5 = new JLabel("Car Name");
        l5.setBounds(60, 260, 120, 25);
        l5.setForeground(Color.WHITE);
        l5.setFont(font);
        panel.add(l5);

        tCarName = new JTextField();
        tCarName.setBounds(180, 260, 165, 25);
        panel.add(tCarName);

        JLabel l6 = new JLabel("Available");
        l6.setBounds(60, 305, 120, 25);
        l6.setForeground(Color.WHITE);
        l6.setFont(font);
        panel.add(l6);

        cbAvailable = new JComboBox<>(new String[]{"Yes", "No"});
        cbAvailable.setBounds(180, 305, 165, 25);
        panel.add(cbAvailable);

        JLabel l7 = new JLabel("Location");
        l7.setBounds(60, 350, 120, 25);
        l7.setForeground(Color.WHITE);
        l7.setFont(font);
        panel.add(l7);

        tLocation = new JTextField();
        tLocation.setBounds(180, 350, 165, 25);
        panel.add(tLocation);

        add = new JButton("Add");
        add.setBounds(80, 420, 110, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        panel.add(add);
        add.addActionListener(this);
        back = new JButton("Back");
        back.setBounds(220, 420, 110, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(this);
        // Driver Image
        ImageIcon icon = new ImageIcon(
                ClassLoader.getSystemResource("icon/driver.png"));

        Image img = icon.getImage()
                .getScaledInstance(300, 300, Image.SCALE_DEFAULT);

        JLabel imageLabel = new JLabel(new ImageIcon(img));
        imageLabel.setBounds(470, 90, 300, 300);
        panel.add(imageLabel);

        setSize(870, 530);
        setLocation(300, 150);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            try {
                conncn con = new conncn();
                String name = tName.getText();
                String age = tAge.getText();
                String gender = (String) cbGender.getSelectedItem();
                String car_com = tCompany.getText();
                String car_nam = tCarName.getText();
                String available = (String) cbAvailable.getSelectedItem();
                String Loc = tLocation.getText();
                String q = "INSERT INTO driver VALUES('" + name + "','" + age + "','" + gender + "','" + car_com + "','" + car_nam + "','" + available + "','" + Loc + "')";
                con.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Driver added");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }else{
            new admin();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new add_driver();
    }
}