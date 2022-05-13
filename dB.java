
package evs;

import java.sql.*;

/*
public class dB {
Connection con;
    public static void main(String []args) throws SQLException{
        
        try{
    //1.Load mysql driver found in the .jar file
    Class.forName("com.mysql.jdbc.Driver");
            
            //Check if connection is successful
            try ( //2.Establish Connection. jdbc:mysql://hostname/dbname
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronicvotingsystem", "root", "")) {
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
     
           
        
                    
        }catch(ClassNotFoundException cnfe){
                System.out.println("Error: Class not found." + cnfe.getMessage());
                }
        
    }
}
*/