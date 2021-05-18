package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;

public class DBContext {

    InitialContext initial;
    Context context;
    //String dbname, serverName, portNumber, image, username, password;
    String dbname = "My_MariaCofe";
    String serverName = "DESKTOP-HBO4V82\\MSSQLSERVER2";
    String portNumber = "1433";
    String username = "sa";
    String password = "123";
    String image = "images/";

//    public DBContext() {
//        try {
//            initial = new InitialContext();
//            Object obj = initial.lookup("java:comp/env");
//            context = (Context) obj;
//            serverName = context.lookup("serverName").toString();
//            dbname = context.lookup("dbName").toString();
//            portNumber = context.lookup("portNumber").toString();
//            image = context.lookup("image").toString();
//            username = context.lookup("username").toString();
//            password = context.lookup("password").toString();
//        } catch (Exception e) {
//        }
//
//    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbname;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, username, password);

        //bên dưới là kết nối kiểu authen dùng cho máy nhà trường
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        Connection conn = DriverManager.getConnection("jdbc:sqlserver://"
//                + serverName + ":"
//                + portNumber + ";databaseName="
//                + dbname +";integratedSecurity=true;");
//        return conn;
    }

    public void closeConnection(ResultSet rs, PreparedStatement ps, Connection con) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    public String getImagePath() throws Exception {
        return image;
    }
}
