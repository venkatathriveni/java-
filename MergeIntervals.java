import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged1 = solution.merge(intervals1);
        System.out.println(Arrays.deepToString(merged1));  
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] merged2 = solution.merge(intervals2);
        System.out.println(Arrays.deepToString(merged2));  
    }
}