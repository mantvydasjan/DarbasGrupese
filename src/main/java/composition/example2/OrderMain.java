package composition.example2;

import java.util.ArrayList;
import java.util.List;

/*
Uzsakymas ORDER gali egzistuoti ir be produktu.
Jeigu turim 5 produktus orderyje ir 2 panaikinam, orderis vistiek egzistuoja.
Nes jis susideda is 5 produktu arba is tiek kiek ju turime.
 */
public class OrderMain {
    public static void main(String[] args) {
        Product product1 = new Product("Kede", 5, 50);
        Product product2 = new Product("Stalas", 3, 150);
        List<Product> produktai = new ArrayList<>();
        produktai.add(product1);
        produktai.add(product2);
        Order order = new Order(produktai);
        System.out.println(order);
        order.getProducts().get(0).setQuantity(2);
        System.out.println(order);
        for (Product product : produktai) {
            if(product.getProductName().equals("Kede")) {
                order.getProducts().remove(product);
            }
        }
        System.out.println(order);
    }
}