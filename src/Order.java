import java.util.ArrayList;

public class Order {
private int orderId;
private ArrayList<Products> orderedProducts = new ArrayList<>();
private ArrayList<Integer> quantities = new ArrayList<>();
private double totalAmount;
private double totalPrice;
Order(int orderId, ShoppingCart cart){
    this.orderId = orderId;


//Copy products from shoppingcart to orderedProducts and quantities Arraylists
    for(int i = 0; i < cart.getProducts().size(); i++){
        orderedProducts.add(cart.getProducts().get(i));
        quantities.add(cart.getQuantity().get(i));
    }
}


    public void payment(){

        for(int i = 0; i < orderedProducts.size(); i++){
           totalPrice =  orderedProducts.get(i).getPrice() * quantities.get(i);
        }
        System.out.println("Total price: " + totalPrice);
    }








public void checkCart(){
    for(int i =0; i < orderedProducts.size(); i++){
        System.out.println(orderedProducts.get(i) + " x " + quantities.get(i) + " = " + orderedProducts.get(i).getPrice());
    }
    payment();
}







}
