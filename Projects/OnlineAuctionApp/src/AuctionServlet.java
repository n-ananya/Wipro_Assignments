package OnlineAuctionApp.src;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuctionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AuctionItemBean item = new AuctionItemBean();
        item.setItemName(request.getParameter("itemName"));
        item.setDescription(request.getParameter("description"));
        item.setStartingBid(Double.parseDouble(request.getParameter("startingBid")));
        item.setEndDate(request.getParameter("endDate"));
        item.setSellerName(request.getParameter("sellerName"));

        request.setAttribute("item", item);
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.forward(request, response);
    }
}
