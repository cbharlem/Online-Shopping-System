import java.util.ArrayList;

public class OrderManager {

private ArrayList<Order> orders = new ArrayList<>();
private int nextOrderId = 1;

//Place Order Method
    //There is an error here. Figure it out tomorrow. may extra number na nag dodoble pota
   public void checkOut(ShoppingCart cart){
       cart.viewCart();
       if(cart.isEmpty()){
           System.out.println("Cart is empty. Cannot Checkout");
           return;
       }
       Order newOrder = new Order(nextOrderId, cart);
       orders.add(newOrder);
   }



    public void orderpayment() {

        if (orders.isEmpty()) {
            System.out.println("No orders yet.");
            return;
        }

        System.out.println("=== ORDER HISTORY ===");
        for (Order order : orders) {
            order.checkCart();
        }
    }




    public void viewOrders() {

        if (orders.isEmpty()) {
            System.out.println("No orders yet.");
            return;
        }

        System.out.println("=== ORDER HISTORY ===");
        for (Order order : orders) {
            order.checkCart();
        }
    }

}
