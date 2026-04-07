import java.util.*;
public class ShoppingCart {
    private ArrayList<Products> products = new ArrayList<>();
    private ArrayList<Integer> quantity = new ArrayList<>();

ShoppingCart(){
products = new ArrayList<>();
quantity = new ArrayList<>();
}


public void addToCart(Products product, int qty){
products.add(product);
quantity.add(qty);
}

public void removeFromCart(Products product, int qty){
 int index = products.indexOf(product);

 if (index == -1){
     System.out.println("Product does not exist");
     return;
 }

 int currentQty = quantity.get(index);

 if(qty >= currentQty){
     products.remove(index);
     quantity.remove(index);
     System.out.println("Product has been removed from cart");
 }else{
     quantity.set(index, currentQty = currentQty - qty);
     System.out.println("Quantity updated");
 }


}

public void viewCart(){
for(int i = 0; i<products.size(); i++){
    System.out.println(i + ". " + products.get(i) +" x " +  quantity.get(i));
}

}
    public void clearCart(){
products.clear();
quantity.clear();
    }

public boolean isEmpty(){
    return products.isEmpty() && quantity.isEmpty();
}

public ArrayList<Products> getProducts(){
    return products;
}

public ArrayList<Integer> getQuantity(){
    return quantity;
}

//public double getBasePrice(){
//    return products.get;
//}




}


