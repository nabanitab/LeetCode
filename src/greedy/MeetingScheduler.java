package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingScheduler {

    // A class to represent a meeting
    static class Meeting {
        int start, end;
        String description;

        // Constructor
        public Meeting(int start, int end, String description) {
            this.start = start;
            this.end = end;
            this.description = description;
        }
    }

    // A utility function to print the selected meetings
    public static void scheduleMeetings(Meeting[] meetings) {
        // Sort meetings according to their end time
        Arrays.sort(meetings, Comparator.comparingInt(m -> m.end));

        System.out.println("Scheduled meetings:");

        // The first meeting always gets selected
        int n = meetings.length;
        int i = 0;
        System.out.println(meetings[i].description + " (" + meetings[i].start + " to " + meetings[i].end + ")");

        // Consider rest of the meetings
        for (int j = 1; j < n; j++) {
            // If this meeting has a start time greater than or
            // equal to the end time of the previously selected meeting,
            // then select it
            if (meetings[j].start >= meetings[i].end) {
                System.out.println(meetings[j].description + " (" + meetings[j].start + " to " + meetings[j].end + ")");
                i = j;
            }
        }
    }

    // Main method to test the meeting scheduler
    public static void main(String[] args) {
        Meeting[] meetings = {
                new Meeting(1, 3, "Team Standup"),
                new Meeting(2, 4, "Project Planning"),
                new Meeting(3, 5, "Client Call"),
                new Meeting(0, 6, "HR Meeting"),
                new Meeting(5, 7, "Design Review"),
                new Meeting(8, 9, "Sprint Retrospective"),
                new Meeting(5, 9, "Town Hall")
        };

        scheduleMeetings(meetings);
    }
}
