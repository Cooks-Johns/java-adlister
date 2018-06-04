import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")  // handles thes the ger request to /login and loads the page w/ the login form
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // render the .jsp and send the user that view
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if( username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        } else {
            String message = " Username or Password is incorrect pleases try another";
            request.setAttribute("message", message);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }
}