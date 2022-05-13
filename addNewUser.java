
package evs;

import java.sql.*;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.*;
import java.awt.event.*;

public class addNewUser extends JFrame {
   private JTextField user, email; 
   private JPasswordField pass;
    
   // private String name, email, pass;
    //int roleID = 1;

    void doAdd() {
        //Check if username or password supplied
        if (user != null || email!=null || pass!=null) {
   
            try {
                //Instantiate DbConnection class to use the connection
                dbConnection2 stayconnected = new dbConnection2();
                stayconnected.getConnection();
                //Create the statement object for executing queries
                Statement stmt = stayconnected.con.createStatement();
                //Execute the statement
                stmt.executeUpdate("INSERT INTO logins (username,emailAddress,Password) VALUES('" + user + "','" + email + "','" + pass + "')");
                //String query1=("INSERT INTO `logins` VALUES(" + user.getText()+ ",'" + email.getText() + "'," + pass.getText() + ")") ;
                //String query1=("INSERT INTO `logins`(userID,username,emailAddress,Password) VALUES (01,user,email,pass);");
                
                //stmt.executeUpdate(query1);
                
                System.out.println("User details added successfully \n");
                //Close the connection
                stayconnected.con.close();
            } catch (SQLException e) {
                System.out.println("Error! See below details \n");
                System.out.println(e);
            }
        } else {
            System.out.println("Username/Email/Password can not be blank.");
        }
        
    }

    public void setUserDetails(JTextField username, JTextField emailAddress, JPasswordField Password) {
        this.user = username;
        this.email = emailAddress;
        this.pass = Password;
        //doAdd();
    }
    
    
    public void addNewUser(){
        setUserDetails(user,email,pass);
        doAdd();
    }
}
