package OnlineAuctionApp.src;

public class AuctionItemBean {
    private String itemName;
    private String description;
    private double startingBid;
    private String endDate;
    private String sellerName;

    // Getters and Setters
    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getStartingBid() { return startingBid; }
    public void setStartingBid(double startingBid) { this.startingBid = startingBid; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public String getSellerName() { return sellerName; }
    public void setSellerName(String sellerName) { this.sellerName = sellerName; }
}
