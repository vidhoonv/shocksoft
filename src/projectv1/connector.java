/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectv1;
import java.sql.*;
/**
 *
 * @author Vidhoon
 */

public class connector {
    
    connector(){}
    Connection connect()
{
       
    try
    {
    Class.forName("oracle.jdbc.OracleDriver");
    System.out.println("TRYING connect");
    Connection myconnection=DriverManager.getConnection("jdbc:oracle:thin:@Vidhoon-PC:1521:oracle","scott", "tiger");
    System.out.println("connection established");
     return myconnection;
 
        
    }
    catch(Exception e)
    {
        System.out.println("Connection error"+e);
    }
   return null;
    }
    
    void close_connect(Connection my_copy)
    {
        try
        {
         my_copy.close();
         System.out.println("Connection closed");
    
        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);
        }
        }
}