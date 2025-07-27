public class Retailer extends Store
{
    //Attributes of Retailer class
    private int vatInclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;

    public Retailer(int storeID, String storeName, String location, String openingHour, double totalSales, double totalDiscount, int vatInclusivePrice, boolean isPaymentOnline, String purchasedYear)
    {
        super(storeID, storeName, location, openingHour);
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);
        this.vatInclusivePrice = vatInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.loyaltyPoint = 0;
    }
    
    //Accessor method for each attribute
    public int getVatInclusivePrice()
    {
        return this.vatInclusivePrice;
    }
    
    public int getLoyaltyPoint()
    {
        return this.loyaltyPoint;
    }
    
    public boolean getIsPaymentOnline()
    {
        return this.isPaymentOnline;
    }
    
    public String getPurchasedYear()
    {
        return this.purchasedYear;
    }
    
    //Mutator method for isPaymentOnline and loyaltyPoint
    public void setIsPaymentOnline(boolean isPaymentOnline)
    {
        this.isPaymentOnline = isPaymentOnline;
    }

    public void setLoyaltyPoint(boolean isPaymentOnline, int vatInclusivePrice)
    {
        if(isPaymentOnline) {
            this.loyaltyPoint = (int) (0.01 * vatInclusivePrice);
        }
    }
    
    //Method to remove product
    public void removeProduct() 
    {
        if(loyaltyPoint == 0 && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))) {
            this.vatInclusivePrice = 0;
            this.loyaltyPoint = 0;
            this.isPaymentOnline = false;
        }
    }
    
    //Method to display details of Retailer and Store
    public void display() 
    {
        if (loyaltyPoint != 0 && !(purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))) {
            super.display();
            System.out.println("VAT Inclusive Price: " + vatInclusivePrice);
            System.out.println("Loyalty Point: " + loyaltyPoint);
            System.out.println("Purchased Year: " + purchasedYear);
        } else {
            super.display();
            System.out.println("Product has been removed!");
        }
    }
}