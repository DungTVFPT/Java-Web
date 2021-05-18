package dao;

import context.DBContext;
import entity.Information;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InformationDAO {

    public Information getInfomation() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        DBContext db = new DBContext();
        try {
            String query = "select * from Information";
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Information information = new Information(rs.getString("shortDescription"),
                        rs.getString("address"),
                        rs.getString("tel"),
                        rs.getString("email"),
                        rs.getString("openingHours"),
                        rs.getString("signature"));
                return information;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            db.closeConnection(rs, ps, conn);
        }
        return null;
    }
}
