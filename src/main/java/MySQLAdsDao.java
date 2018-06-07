
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;


    public MySQLAdsDao(Config config) {

        try {
            DriverManager.registerDriver(new Driver());

            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description) VALUES "
                + "(" + ad.getUserId() + ", "
                + "'" + ad.getTitle() + "', "
                + "'" + ad.getDescription() + "')";
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }


    @Override
    public List<Ad> all() {
        try {
            Statement stmt = this.connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM ads");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error retrievering all ads from the database", e);
        }

    }



    private List<Ad> createAdsFromDatabaseResults(ResultSet rs) throws SQLException {

        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            // creat an individual ad and add itto out list

            long id = rs.getLong("id");
            long userId = rs.getLong("user_id");
            String title = rs.getString("title");
            String descriotion = rs.getString("description");


            Ad ad = new Ad();

            ad.setId(id);
            ad.setUserId(userId);
            ad.setTitle(title);
            ad.setDescription(descriotion);
        }
        return ads;
    }


    @Override
    public Long insert(Ad ad) throws SQLException {
        Statement stmt = connection.createStatement();

        String sql = createInsertQuery(ad);
        System.out.println("Preparing to run query:" + sql);
        stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

        ResultSet resultSet = stmt.getGeneratedKeys();
        resultSet.next();
        return resultSet.getLong(1);
    }

    private String creatInsertQuery(Ad ad) {
        String sql = "INSERT INTO ads(user_id, title, description) CALUES(%d, '%s', '%s'";
        return String.format(
                sql,
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription()
        );
    }
}