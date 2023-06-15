package bank.management.system;
import java.sql.*;
public class Conn {
    Connection c; //
    Statement s;
    public Conn(){
        try {
//Registering the driver:
            //Class.forName(com.mysql.cj.jdbc.Driver);-> not needed in newer versions
//Creating the connection:
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root", "root");
            s = c.createStatement()
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
