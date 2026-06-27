package Hotel.management.system;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conncn {
    Connection con;
    Statement statement;
    public conncn(){

        String url="jdbc:mysql://localhost:3306/hotelms";
        String username="root";
        String password="Amruta@2005";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("success load");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            con= DriverManager.getConnection(url,username,password);
            statement=con.createStatement();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new conncn();
    }
}