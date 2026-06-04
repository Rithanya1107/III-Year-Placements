import java.util.Scanner;

public class SegmentTree {
    static int[] tree;
    static void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            build(arr, 2 * node, start, mid);
            build(arr, 2 * node + 1, mid + 1, end);
            tree[node] = tree[2 * node] + tree[2 * node + 1];
        }
    }

    static int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return 0;
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = (start + end) / 2;
        int leftSum = query(2 * node, start, mid, l, r);
        int rightSum = query(2 * node + 1, mid + 1, end, l, r);
        return leftSum + rightSum;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        tree = new int[4 * n];
        build(arr, 1, 0, n - 1);
        System.out.print("Enter left index: ");
        int l = sc.nextInt();
        System.out.print("Enter right index: ");
        int r = sc.nextInt();
        int result = query(1, 0, n - 1, l, r);
        System.out.print("Values from index " + l + " to " + r + " : ");
        for (int i = l; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.print("Sum = " + result + "  (");
        for (int i = l; i <= r; i++) {
            System.out.print(arr[i]);
            if (i < r) {
                System.out.print(" + ");
            }
        }
        System.out.println(")");
        sc.close();
    }
}