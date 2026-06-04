public class WaterTankGreedy {

    public static void main(String[] args) {

        int waterNeeded = 73;

        int[] buckets = {20, 3, 2 , 1};

        int totalBuckets = 0;

        System.out.println("Buckets Used:");

        for (int bucket : buckets) {

            while (waterNeeded >= bucket) {

                System.out.println(bucket + " Liter Bucket");

                waterNeeded -= bucket;

                totalBuckets++;
            }
        }

        System.out.println("\nMinimum Number of Buckets = " + totalBuckets);
    }
}