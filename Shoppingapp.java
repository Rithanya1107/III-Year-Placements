import java.util.*;

public class Shoppingapp {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Keyboard");

        Set<String> categories = new HashSet<>(cart);
        categories.add("Electronics");
        categories.add("Fashion");
        categories.add("Electronics");

        Map<String, Double> price = new HashMap<>();
        price.put("Laptop", 999.99); 
        price.put("Mouse", 25.99);
        price.put("Keyboard", 45.99);

        System.out.println("Cart Items: " + cart);
        System.out.println("Unique Categories: " + categories);
        System.out.println("Price List: " + price);
    }  
}
