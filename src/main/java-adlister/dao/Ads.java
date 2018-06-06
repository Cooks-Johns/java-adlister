
import java.sql.SQLException;
import java.util.List;

public interface Ads {

    List<Ads> all() throws SQLException;

    Long insert(Ads ads) throws SQLException;

}
