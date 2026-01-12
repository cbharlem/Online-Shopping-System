public abstract class Products {

    private int productID;
    private String name;
    private double basePrice;
   private int stockQuantity;



    Products(int productId, String name, double basePrice, int stockQuantity){
this.productID = productId;
this.name = name;
this.basePrice = basePrice;
this.stockQuantity = stockQuantity;
    }

public String getProductInfo(){
    return "Product ID: " + productID + " | Name: " + name + " | Price: ₱" + basePrice + " | Stock: " + stockQuantity;
}

public String getName(){
        return name;
}

public String toString(){
        return name;
}




}
