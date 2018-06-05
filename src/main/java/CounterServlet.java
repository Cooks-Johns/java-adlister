import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if("true".equals(request.getParameter("rest"))) {
        HttpSession session = request.getSession();
        counter = 0;

           session.setAttribute("counter", counter);

       if(counter != 0) {
           counter = (int) session.getAttribute("counter");
       } else {

           counter++;

           request.setAttribute("counter", counter);
           request.getRequestDispatcher("/counter.jsp").forward(request, response);
           }
       }
    }
}

