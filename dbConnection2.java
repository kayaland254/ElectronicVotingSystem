
package evs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnection2 {
    Connection con;
    
    Connection getConnection() throws SQLException{
        
        try{
    //1.Load mysql driver found in the .jar file
    Class.forName("com.mysql.jdbc.Driver");
            
            //Check if connection is successful
            try ( //2.Establish Connection. jdbc:mysql://hostname/dbname
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33066/new_schema", "root", "password")) {
                //Check if connection is successful
                if (con !=null){
                   System.out.println("Connection successful.");
                
                    
                }else{
                    System.out.println("An error occured.");
                }
                
                //3. Create a statement for executing sql statements
                //Here electronic voting system is database name, root is username and no password by default
                Statement stmt = con.createStatement();
                
                //4.Execute the statement
                ResultSet rs=stmt.executeQuery("Select * from logins");
                
                //5. Process result set
                while (rs.next()){
                    System.out.println("Username is " + rs.getString(1) + "," + "Password is " );
                }
                
                //6. Close the connection
            }
     
          // return con;
           
        
                    
        }catch(ClassNotFoundException cnfe){
                System.out.println("Error: Class not found." + cnfe.getMessage());
                }
     return con;
     
     
    }
}
