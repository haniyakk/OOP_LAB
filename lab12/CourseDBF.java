package condb;
import java.sql.*;

public class CourseDBF extends BaseDBF{
    
    void displayAll() throws ClassNotFoundException, SQLException 
    {
        Statement st;
        st = connect(); //calling the connection function for connectivity
        String sql = "Select * from Course";
        ResultSet rs = st.executeQuery(sql);
        while (rs.next())
        {
            System.out.println("\t"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
    }
    void add(int id,String n, String t) throws ClassNotFoundException, SQLException
    {
        Statement st;
        st= connect();
        String query = "INSERT INTO Course(id, cName, cTeacher) VALUES(" + id + ", '" + n + "', '" + t + "')";
        st.executeUpdate(query);
        System.out.println("Database updates\nData has been added");
    }
    void delete(int id) throws SQLException, ClassNotFoundException
    {
        Statement st;
        st = connect();
        String query = "DELETE FROM Course WHERE id = " + id;
        st.executeUpdate(query);
        System.out.println("Record has been deleted");
    }
    void update(int id, String n, String t) throws SQLException, ClassNotFoundException 
    {
        Statement st;
        st = connect();
        String updateQuery = "UPDATE Course SET cName = '" + n + "', cTeacher = '" + t + "' WHERE id = " + id;
        int rowsUpdated = st.executeUpdate(updateQuery);
        if (rowsUpdated > 0) {
            System.out.println("Record updated successfully!");
        } 
        else {
            System.out.println("No record found with Reg: " + id);
        }
    }
}
