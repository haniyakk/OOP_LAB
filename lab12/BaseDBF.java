package condb;

import java.sql.Connection;
import java.sql.*;

public class BaseDBF {
    public Statement connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String url = "jdbc:ucanaccess://C:\\Users\\HP\\Documents\\NetBeansProjects\\ConDB\\StuDatabase.accdb";
        Connection conn = DriverManager.getConnection(url);
        Statement st = conn.createStatement();
        return st;
    }
}
