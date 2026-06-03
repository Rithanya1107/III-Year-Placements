import java.util.*;

class SegmentTree {

    int[] tree;

    SegmentTree(int[] arr) {
        tree = new int[4 * arr.length];
        build(arr, 0, 0, arr.length - 1);
    }

    void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;

            build(arr, 2 * node + 1, start, mid);
            build(arr, 2 * node + 2, mid + 1, end);

            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }

    int query(int node, int start, int end, int l, int r) {

        if (r < start || end < l)
            return 0;

        if (l <= start && end <= r)
            return tree[node];

        int mid = (start + end) / 2;

        return query(2 * node + 1, start, mid, l, r)
                + query(2 * node + 2, mid + 1, end, l, r);
    }
}

public class SupermarketSales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] sales = new int[n];

        System.out.println("Enter sales for each day:");
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            sales[i] = sc.nextInt();
        }

        System.out.print("\nEnter starting day: ");
        int startDay = sc.nextInt();

        System.out.print("Enter ending day: ");
        int endDay = sc.nextInt();

        SegmentTree st = new SegmentTree(sales);

        int total = st.query(0, 0, n - 1, startDay - 1, endDay - 1);

        System.out.println("\nSales Details:");
        for (int i = startDay - 1; i <= endDay - 1; i++) {
            System.out.println("Day " + (i + 1) + " : " + sales[i]);
        }

        System.out.println("\nTotal Sales from Day "
                + startDay + " to Day " + endDay + " = " + total);

        sc.close();
    }
}