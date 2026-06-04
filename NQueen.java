import java.util.Scanner;

public class NQueen {

    static int N;
    static int count = 0;

    static boolean[] cols;
    static boolean[] d1;
    static boolean[] d2;

    static void solve(int row) {

        if (row == N) {
            count++;
            return;
        }

        for (int col = 0; col < N; col++) {

            if (cols[col] || d1[row + col] || d2[row - col + N - 1]) {
                continue;
            }

            // Place Queen
            cols[col] = true;
            d1[row + col] = true;
            d2[row - col + N - 1] = true;

            solve(row + 1);

            // Backtrack
            cols[col] = false;
            d1[row + col] = false;
            d2[row - col + N - 1] = false;
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        N = sc.nextInt();

        cols = new boolean[N];
        d1 = new boolean[2 * N];
        d2 = new boolean[2 * N];

        solve(0);

        System.out.println("Number of solutions = " + count);

        sc.close();
    }
}