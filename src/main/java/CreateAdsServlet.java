
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CreateAdsServlet", urlPatterns = "/ads/create")
public class CreateAdsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ad ad = new Ad(
                request.getParameter("title"),
                request.getParameter("description")
        );
        try {
            DaoFactory.getAdsDao().insert(ad);
            response.sendRedirect("/ads");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
