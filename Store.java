public class Store 
{
    //Attributes of Store class
    private int storeId;
    private String storeName; 
    private String location;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;
    
    public Store(int storeId, String storeName, String location, String openingHour)
    {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        this.totalSales = 0.0;
        this.totalDiscount = 0.0;
    }
 
    //Accessor method for each attribute
    public int getStoreId()
    {
        return this.storeId; 
    }

    public String getStoreName()
    {
        return this.storeName; 
    }
 
    public String getLocation()
    {
        return this.location;
    }
 
    public String getOpeningHour()
    {
        return this.openingHour; 
    }
 
    //Mutator method for Total sales and Total discount
    public void setTotalSales(double totalSales)
    {
        this.totalSales += totalSales;
    }

    public void setTotalDiscount(double totalDiscount)
    {
        this.totalDiscount += totalDiscount;
    }
 
    //Method to display details of Store
    public void display()
    {
        System.out.println("The Store ID is " + storeId + ".");
        System.out.println("The Store name is " + storeName + ".");
        System.out.println("The Store location is " + location + ".");
        System.out.println("The opening hour of " + storeName + " is " + openingHour + ".");
        System.out.println("The total sales is " + totalSales + ".");
        if(totalSales == 0 && totalDiscount == 0) {
            System.out.println("No purchase is made.");
        }
    }
}