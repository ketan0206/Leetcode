/*

Since this is a premium question, it can be viewed on below URL :
https://www.programcreek.com/2014/07/leetcode-meeting-rooms-java/



Grind 169 
https://www.techinterviewhandbook.org/grind75?difficulty=Easy&difficulty=Medium&difficulty=Hard&weeks=9&hours=17

252. Meeting Rooms

https://www.programcreek.com/2014/07/leetcode-meeting-rooms-java/

*/

/*
TC : O(n * log(n)) -> for sorting.
SC : O(1)
*/
public boolean canAttendMeetings(Interval[] intervals) {
    Arrays.sort(intervals, new Comparator<Interval>(){
        public int compare(Interval a, Interval b){
            return a.start-b.start;
        }
    });
 
    for(int i=0; i<intervals.length-1; i++){
        if(intervals[i].end>intervals[i+1].start){
            return false;
        }
    }
 
    return true;
}