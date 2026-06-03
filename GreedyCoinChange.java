public class GreedyCoinChange {

    public static void main(String[] args) {

        int amount = 111;

        int[] coins = {50, 20, 10, 5, 2, 1};

        System.out.println("Amount: " + amount);
        System.out.print("Coins Used: ");

        for (int coin : coins) {

            while (amount >= coin) {
                System.out.print(coin + " ");
                amount -= coin;
            }
        }
    }
}