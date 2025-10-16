package Mile3Assignment.JSP_Servlet_Application;

import java.io.IOException;

public class ChangePasswordServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String old = request.getParameter("old");
    String newPwd = request.getParameter("new");
    String confirm = request.getParameter("confirm");

    if (!newPwd.equals(confirm)) {
        request.setAttribute("error", "New and confirm passwords do not match");
        request.getRequestDispatcher("changePassword.jsp").forward(request, response);
    } else {
        // Update DB logic
        updatePassword(old, newPwd);
        response.sendRedirect("index.html");
    }
}

}
