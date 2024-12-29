package condb;
public class Notes {
/*package condb;
import java.sql.*;
public class DBFun {
    //to build a connection we have this method
    //connection and then statement then after you can just call this method 
    //so this method will return a statement that will be needed everytime you do anything
    //sequence is obv mandatory
    //for db we need to handle exceptions 
    //throws will handle the database problem and url exception
    public Statement connect() throws ClassNotFoundException, SQLException
    {
        //try{
        //this will activate the driver we added into our program
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        //not mandatory if your path is on default path like here but still good practice 
        String url = "jdbc:ucanaccess://C:\\Users\\HP\\Documents\\NetBeansProjects\\ConDB\\StuDatabase.accdb";
        //reference of connection class
        //and as the driver manager class has been given the connection so now we are asking it to get the connection from the path where our db is 
        Connection conn = DriverManager.getConnection(url);
        
        //now all the actual edit delete we need a statement (sql queries)
        //so we will be preparing our connection for this statement 
        //we will be maniulating the statement where needed 
        //but just to prepare this is what is mandatory
        Statement st = conn.createStatement();
        return st;
        //}
        
        catch(ClassNotFoundException | SQLException e)
        {
            exceptions are being handled so all the errors disappeared
            sometimes this doesnt work when working with return statement 
            so another better option is throws
        }
        
    }
    //displaying db in our program
    void displayAll() throws ClassNotFoundException, SQLException 
    {
        //an obj of class Statement
        Statement st;
        st = connect(); //calling the connection function for connectivity
        String sql = "Select * from Student";
        //to read data from our db
        //just like files all the data is now 
        //a string so to convert use parsers string to int 
        ResultSet rs = st.executeQuery(sql);
        //read until there is data to display
        while (rs.next())
        {
            System.out.println("    "+rs.getString(1)+"      "+rs.getString(2)+"      "+rs.getString(3));
        }
    }
    
    void update(int reg, String newStuName, String depart) throws SQLException, ClassNotFoundException 
    {
        Statement st;
        st = connect();
        // SQL update query with the new parameter name
        //" AND Department = '" + department + "'"
        //'"+"fieldName"+"'
        //this exact format is to followed spaces on both side of AND but '"+"smth"+"' can have spaces but just to be on the safe side avoid unnecessary spaces 
        String updateQuery = "UPDATE Student SET StuName = ' " + newStuName + " ' WHERE Reg = " + reg + " AND Department = ' " + depart + " ' ";
        int rowsUpdated = st.executeUpdate(updateQuery);
        if (rowsUpdated > 0) {
            System.out.println("Record updated successfully!");
        } 
        else {
            System.out.println("No record found with Reg: " + reg);
        }
    }
    
}
*/
}
