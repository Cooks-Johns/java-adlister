import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.activation.ActivationGroup_Stub;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")  // handles thes the ger request to /login and loads the page w/ the login form
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // render the .jsp and send the user that view
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if( username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }
}