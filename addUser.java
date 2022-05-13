
package evs;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.Statement;

import java.sql.SQLException;
import sun.security.util.Password;

public class addUser {
    JTextField userName, emailAddress;
    JPasswordField Password;
    
    void addUser() {
        
        //Check if username or password supplied
        if (userName != null || emailAddress!=null || Password!=null) {
   
            try {
                //Instantiate dbConnection class to use the connection
                dbConnection2 stayconnected = new dbConnection2();
                stayconnected.getConnection();
                //Create the statement object for executing queries
                Statement stmt = stayconnected.con.createStatement();
                //Execute the statement
                String query1=("INSERT INTO `logins` VALUES(" + userName.getText()+ ",'" + emailAddress.getText() + "'," + Password.getText() + ")") ;
                
                stmt.executeUpdate(query1);
                
                 // stmt.executeUpdate(INSERT INTO "logins " + " VALUES(" + userName + "','" + emailAddress + "','" + Password + ")");
                System.out.println("User details added successfully \n");
                
            //Close the connection
                stayconnected.con.close();
            } catch (SQLException e) {
               System.out.println("Error! See below details \n");
               System.out.println(e);
           }
        } else {
            System.out.println("Username/ Email/ Password cannot be blank.");
        }
    }
    
    
    public void setUserDetails(JTextField name, JTextField email, JPasswordField  password)throws SQLException{
       this.userName = name;
       this.emailAddress = email;
       this.Password = password;
       addUser();
       }
    
}
