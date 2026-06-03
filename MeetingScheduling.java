import java.util.*;

public class MeetingScheduling {

    public static void main(String[] args) {

        int[][] meetings = {
                {1, 2, 4},
                {2, 5, 6},
                {3, 1, 7},
                {4, 7, 9},
                {5, 8, 10}
        };

        // Sort by end time
        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);

        System.out.println("Selected Meetings:");

        int count = 1;
        int lastEnd = meetings[0][2];

        System.out.println("Meeting " + meetings[0][0]);

        for (int i = 1; i < meetings.length; i++) {

            if (meetings[i][1] >= lastEnd) {
                System.out.println("Meeting " + meetings[i][0]);
                count++;
                lastEnd = meetings[i][2];
            }
        }

        System.out.println("Total Meetings: " + count);
    }
}