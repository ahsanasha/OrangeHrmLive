package models;

import utilities.DatabaseConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SalesMasterCity {
    private final DatabaseConnector db;

    public SalesMasterCity() {
        this.db = new DatabaseConnector();
    }
    public String getCity() {
        try {
            String query = "SELECT * FROM DB_NAME.TBL_NAME WHERE id_kota_dad=?;";
            PreparedStatement preStatement = db.getCon().prepareStatement(query);
            preStatement.setString(1, "31.74");
            ResultSet resultSet = preStatement.executeQuery();
            resultSet.next();
            String city = resultSet.getString("nama_kota");
            db.getCon().close();
            return city;
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
