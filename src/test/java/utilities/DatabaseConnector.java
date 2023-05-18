package utilities;

import java.sql.*;

public class DatabaseConnector {

    static String url;
    static String username;
    static String password;

    private Connection con = null;


    public DatabaseConnector() {
        try {
            DatabaseReader dbReader = new DatabaseReader();
            this.url = dbReader.getProperty("db.sales.management.host");
            this.username = dbReader.getProperty("db.sales.management.username");
            this.password = dbReader.getProperty("db.sales.management.password");
            Class.forName("org.postgresql.Driver");
            this.con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }

}

