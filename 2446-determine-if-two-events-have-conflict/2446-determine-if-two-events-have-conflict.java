class Solution {

    public int convert(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));

        return hour * 60 + minute;
    }

    public boolean haveConflict(String[] event1, String[] event2) {

        int start1 = convert(event1[0]);
        int end1 = convert(event1[1]);

        int start2 = convert(event2[0]);
        int end2 = convert(event2[1]);

        return start1 <= end2 && start2 <= end1;
    }
}