public class ProductDetails {
    public static void main(String[] args) {

        String[] products = {
            "Laptop",
            "Mobile",
            "Headphones",
            "Smart Watch",
            "Keyboard"
        };

        double[] prices = {
            55000,
            25000,
            3000,
            5000,
            1500
        };

        double totalAmount = 0;
        double maxPrice = prices[0];
        String expensiveProduct = products[0];

        for (int i = 0; i < products.length; i++) {
            totalAmount += prices[i];

            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                expensiveProduct = products[i];
            }
        }

        System.out.println("Product Details:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " : Rs " + prices[i]);
        }

        System.out.println("\nTotal Amount = Rs " + totalAmount);
        System.out.println("Most Expensive Product = " + expensiveProduct);
        System.out.println("Price = Rs " + maxPrice);
    }
}
