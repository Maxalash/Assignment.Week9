package Assignments.Week4;

import java.sql.*;

public class ConnectDB {
    public Connection get_connection() {
        Connection con = null;
        String host = "localhost";
        String port = "5432";
        String db_name = "Java";
        String username = "postgres";
        String password = "11ko25sh";
        try {
            Class.forName("org.postgresql.Driver");
            // Establish the connection
            con = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name, username, password);
            if(con!=null) {
                System.out.println("Database opened successfully \n");
            } else {
                System.out.println("Database failed to open \n");
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
