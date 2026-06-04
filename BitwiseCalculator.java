import java.util.Scanner;

public class BitwiseCalculator {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nChoose Operation");
        System.out.println("1. AND (&)");
        System.out.println("2. OR (|)");
        System.out.println("3. XOR (^)");
        System.out.println("4. Left Shift (<<)");
        System.out.println("5. Right Shift (>>)");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1 -> System.out.println("AND Result = " + (a & b));

            case 2 -> System.out.println("OR Result = " + (a | b));

            case 3 -> System.out.println("XOR Result = " + (a ^ b));

            case 4 -> System.out.println("Left Shift Result = " + (a << b));

            case 5 -> System.out.println("Right Shift Result = " + (a >> b));

            default -> System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
