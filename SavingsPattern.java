public class SavingsPattern {
    public static void main(String[] args) {

        int firstMonth = 100;
        int secondMonth = 100;

        System.out.println("First 6 Months Savings:");

        System.out.print(firstMonth + " ");
        System.out.print(secondMonth + " ");

        for (int i = 3; i <= 6; i++) {
            int current = firstMonth + secondMonth;
            System.out.print(current + " ");

            firstMonth = secondMonth;
            secondMonth = current;
        }
    }
}