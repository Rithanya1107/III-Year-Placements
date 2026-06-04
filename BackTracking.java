import java.util.*;

public class BackTracking {

    static void findCombinations(int start, int n, List<Integer> current) {

        if (!current.isEmpty()) {

            int gcdValue = current.get(0);

            for (int i = 1; i < current.size(); i++) {
                gcdValue = gcd(gcdValue, current.get(i));
            }

            if (gcdValue == 1) {
                System.out.println(current);
            }
        }

        for (int i = start; i <= n; i++) {

            current.add(i);          // Choose

            findCombinations(i + 1, n, current);

            current.remove(current.size() - 1); // Backtrack
        }
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        findCombinations(1, n, new ArrayList<>());

        sc.close();
    }
}

