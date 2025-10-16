<%@ page import="AuctionItemBean" %>
<%
  AuctionItemBean item = (AuctionItemBean) request.getAttribute("item");
%>
<html>
<head><title>Auction Details</title></head>
<body>
  <h2>Auction Item Details</h2>
  <p><strong>Item Name:</strong> <%= item.getItemName() %></p>
  <p><strong>Description:</strong> <%= item.getDescription() %></p>
  <p><strong>Starting Bid:</strong> ₹<%= item.getStartingBid() %></p>
  <p><strong>Bid Ends On:</strong> <%= item.getEndDate() %></p>
  <p><strong>Seller:</strong> <%= item.getSellerName() %></p>
</body>
</html>
