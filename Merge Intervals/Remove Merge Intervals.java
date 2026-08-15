class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
     /* int remove = 0;
        boolean[] covered = new boolean[intervals.length];

        for (int i = 0; i < intervals.length; i++) {

            if (covered[i]) continue;

            for (int j = 0; j < intervals.length; j++) {

                if (i == j) continue;

                if (intervals[j][0] <= intervals[i][0] &&
                    intervals[i][1] <= intervals[j][1]) {

                    covered[i] = true;
                    remove++;
                    break;
                }
            }
        }

        return intervals.length - remove;*/
         Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];   // Larger end first if starts are equal
            }
            return a[0] - b[0];       // Sort by start
        });

        int count = 0;
        int end = 0;

        for (int[] interval : intervals) {
            if (interval[1] > end) {
                count++;
                end = interval[1];
            }
        }

        return count;
    }
}