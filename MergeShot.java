import java.util.*;

public class MergeShot {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = scanner.nextInt();

        int lo = 0;
        int hi = arr.length - 1;
        boolean found = false;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            else if (arr[mid] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        scanner.close();
    }
}