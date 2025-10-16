package Mile3Assignment.JSP_Servlet_Application;

import java.io.IOException;

public class LoginServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String user = request.getParameter("userid");
    String pass = request.getParameter("password");

    // Validate against DB
    if (validCredentials(user, pass)) {
        request.setAttribute("userid", user);
        request.getRequestDispatcher("Home.jsp").forward(request, response);
    } else {
        request.setAttribute("error", "Invalid credentials");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}

}
