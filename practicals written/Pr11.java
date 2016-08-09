
import java.sql.*;
import java.io.*;
public class Pr11 {
    Connection conn=null;
    ResultSet rs;
	Statement stmt;
    public void Connectionfg()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","vikas");
            System.out.println("Connection Estsablished");
            String query = "select * from hdetails";

                if (conn!=null)
                {
                    Statement stmt = conn.createStatement();
                    rs= stmt.executeQuery(query);

                    while(rs.next())
                    {
                     
                    String a= rs.getString(1);
                    String b=rs.getString(2);
                    String c=rs.getString(3);
					    String d=rs.getString(4);
                    System.out.println(""+a+"\n"+b+"\n"+c+"\n"+d);
                    }

                } 
                }catch(Exception e){}
          
        
    }
    public static void main(String[] args) {
       
     Pr11 p=new Pr11();
	 p.Connectionfg();
    }
    
}
