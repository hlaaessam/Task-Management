
package javaapplication5;

import java.sql.*;

public class Connect{
    
   private static final String className="com.mysql.jdbc.Driver";
   private static final String directory="jdbc:mysql://localhost:3306/task_management?zeroDateTimeBehavior=convertToNull";
   private static final String dbUser_name="root";
   private static final String dbPassword="";
   
 
   public Connection getConnect() throws ClassNotFoundException, SQLException{
   
   
   Class.forName(className);
   return DriverManager.getConnection(directory,dbUser_name,dbPassword);
   
   }

  
    
    
}
 
