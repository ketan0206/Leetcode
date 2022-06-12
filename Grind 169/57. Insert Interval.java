/*
Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17
57. Insert Interval

https://leetcode.com/problems/insert-interval/
*/

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int insertIndex = 0;
        for (int i = 0; i < intervals.length; ++i) {
            if (intervals[i][0] < newInterval[0]) {
                ++insertIndex;
            }
        }
        LinkedList<int[]> intervalsList = new LinkedList<>();
        for (int i = 0; i <= intervals.length; ++i) {
            if (i < insertIndex) {
                intervalsList.add(intervals[i]);
            } else if (i == insertIndex) {
                if (intervalsList.size() > 0 && intervalsList.getLast()[1] >= newInterval[0]) {
                    intervalsList.getLast()[1] = Math.max(intervalsList.getLast()[1], newInterval[1]);
                } else {
                    intervalsList.add(newInterval);
                }
            } else {
                if (intervalsList.size() > 0 && intervalsList.getLast()[1] >= intervals[i - 1][0]) {
                    intervalsList.getLast()[1] = Math.max(intervalsList.getLast()[1], intervals[i - 1][1]);
                } else {
                    intervalsList.add(intervals[i - 1]);
                }
            }
        }
        return intervalsList.toArray(new int[intervalsList.size()][2]);
    }
}