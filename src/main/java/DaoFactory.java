
import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    public static Config config = new Config(
            "jdbc:mysql://localhost:3306/adlister_db?serverTimezone=UTC&useSSL=false",
            "root",
            "codeup");
    public static Ads getAdsDao(){

        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}