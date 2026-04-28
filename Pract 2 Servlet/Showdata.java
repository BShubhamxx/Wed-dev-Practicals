import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ShowData")
public class ShowData extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ShowData() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().append("Served at: ").append(request.getContextPath());
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("Hello World");
        out.println("<h1>Student Info</h1>");

        String name1 = request.getParameter("name");
        out.println("Name of the user: " + name1 + "<br>");

        String rollno = request.getParameter("rollno");
        out.println("Rollno of the user: " + rollno + "<br>");

        String tel = request.getParameter("phone");
        out.println("Phone of the user: " + tel + "<br>");

        String gender = request.getParameter("gender");
        out.println("Gender of user: " + gender + "<br>");

        Cookie c = new Cookie("name", name1);
        response.addCookie(c);

        out.println("<form action='Student2'>");
        out.println("<input type='submit' value='Go to next Page'>");
        out.println("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}