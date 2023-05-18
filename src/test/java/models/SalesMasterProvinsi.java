package models;

import utilities.DatabaseConnector;

import java.sql.*;

public class SalesMasterProvinsi {

    private final DatabaseConnector db;

    public SalesMasterProvinsi() {
        this.db = new DatabaseConnector();
    }
    public String getProvince() {
        try {
                String query = "SELECT * FROM DB_NAME.TBL_NAME WHERE id_provinsi_dad=?;";
                PreparedStatement preStatement = db.getCon().prepareStatement(query);
                preStatement.setString(1, "31");
                ResultSet resultSet = preStatement.executeQuery();
                resultSet.next();
                String province = resultSet.getString("nama_provinsi");
                db.getCon().close();
                return province;
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
