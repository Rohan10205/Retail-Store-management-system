public class Department extends Store
{
    //Attributes of Department class
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;
    
    public Department(int storeId, String storeName, String location, String openingHour, double totalSales, double totalDiscount, String productName, double markedPrice)
    {
        super(storeId, storeName, location, openingHour);
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);
        this.isInSales = true;
        this.sellingPrice = 0.0;
        this.productName = productName;
        this.markedPrice = markedPrice;
    }
    
    //Accessor method for each attribute
    public String getProductName()
    {
        return this.productName;
    }
    
    public double getMarkedPrice()
    {
        return this.markedPrice;
    }
    
    public double getSellingPrice()
    {
        return this.sellingPrice;
    }
    
    public boolean getIsInSales()
    {
        return this.isInSales;
    }
    
    //Mutator method for Marked price
    public void setMarkedPrice(double markedPrice)
    {
        this.markedPrice = markedPrice;
    }
    
    //Method to calculate Selling price of the product
    public void calculateDiscountPrice(boolean isInSales, double markedPrice)
    {
        if(isInSales) {
          if(markedPrice >= 5000) {
              sellingPrice = markedPrice - (markedPrice * 0.2);
          }
          else if(markedPrice >= 3000) {
              sellingPrice = markedPrice - (markedPrice * 0.1);
          }
          else if(markedPrice >= 1000) {
              sellingPrice = markedPrice - (markedPrice * 0.05);
          }
          else {
              sellingPrice = markedPrice;   
          }
        }
        setTotalDiscount(markedPrice-sellingPrice);
        setTotalSales(sellingPrice);
        this.isInSales = false;
    }
    
    //Method to display details of Department and Store
    public void display()
    {
        super.display();
        if(isInSales) {
            System.out.println("The product name is " + productName);
            System.out.println("The marked price of the product is " + markedPrice);
        }
        else {
            System.out.println("The product name is: " + productName);
            System.out.println("The selling price of the product is " + sellingPrice);
        }
    }
}