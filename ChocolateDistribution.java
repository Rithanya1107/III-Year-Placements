
public class ChocolateDistribution {

    public static void main(String[] args) {

        int chocolates = 18;

        int[] boxes = {10, 5, 2, 1};

        int totalBoxes = 0;

        System.out.println("Boxes Used:");

        for (int box : boxes) {

            while (chocolates >= box) {

                System.out.println(box + " chocolate box");

                chocolates -= box;

                totalBoxes++;
            }
        }

        System.out.println("Minimum Number of Boxes used = " + totalBoxes);
    }
}

