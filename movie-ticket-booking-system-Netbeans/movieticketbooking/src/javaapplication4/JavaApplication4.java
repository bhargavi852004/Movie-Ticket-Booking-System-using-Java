package javaapplication4;
import java.sql.Connection;
import java.sql.DriverManager;

public class JavaApplication4 {
    Connection conn=null;
public static Connection ConnecrDb(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/java_dbmovies","root","");
        return conn;
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
return null;
}

   
}
