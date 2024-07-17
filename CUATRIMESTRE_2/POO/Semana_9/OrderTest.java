

public class OrderTest {
   public static void main(String[] args){
        Order order1 = new Order();
        Shirt shirt1 = new Shirt();

        Shirt.setPrice(14.00);
        Order.addShirt(Shirt);

   } 
}
