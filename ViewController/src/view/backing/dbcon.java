package view.backing;
import java.sql.*;
public class dbcon {
    public dbcon() {
        super();
    }
    public  static Connection getConnection(){
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String thinConn ="jdbc:mysql://localhost/tollon";
            conn = DriverManager.getConnection(thinConn, "root", "admin");
            conn.setAutoCommit(true);
        }
        catch(Exception er){
            er.printStackTrace();
        }
        return conn;
    }
}

