package condb;
import java.sql.*;
public class StudentsDBF extends BaseDBF {
    void displayAll() throws ClassNotFoundException, SQLException 
    {
        Statement st;
        st = connect(); //calling the connection function for connectivity
        String sql = "Select * from Student";
        ResultSet rs = st.executeQuery(sql);
        while (rs.next())
        {
            System.out.println("\t"+rs.getString(3)+"\t"+rs.getString(1)+"\t"+rs.getString(2));
        }
    }
    void add(int reg,String n, String d) throws ClassNotFoundException, SQLException
    {
        Statement st;
        st= connect();
        String query = "INSERT INTO Student(Reg, StuName, Department) VALUES(" + reg + ", '" + n + "', '" + d + "')";
        st.executeUpdate(query);
        System.out.println("Database updates\nData has been added");
    }
    void delete(int r) throws SQLException, ClassNotFoundException
    {
        Statement st;
        st = connect();
        String query = "DELETE FROM Student WHERE Reg = " + r;
        st.executeUpdate(query);
        System.out.println("Record has been deleted");
    }
    void update(int reg, String newStuName, String depart) throws SQLException, ClassNotFoundException 
    {
        Statement st;
        st = connect();
        
        String updateQuery = "UPDATE Student SET StuName = '" + newStuName + "', Department = '" + depart + "' WHERE Reg = " + reg;
        int rowsUpdated = st.executeUpdate(updateQuery);
        if (rowsUpdated > 0) {
            System.out.println("Record updated successfully!");
        } 
        else {
            System.out.println("No record found with Reg: " + reg);
        }
    }

}
