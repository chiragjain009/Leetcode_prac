import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> res=new ArrayList<>();
        int resIndex=0;
        
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        
        int[] curr={intervals[0][0],intervals[0][1]};
        for(int i=1;i<intervals.length;i++){
            if(checkValidOverLap(curr,intervals,i)){
                curr[0] = Math.min(intervals[i][0], curr[0]);
                curr[1] = Math.max(intervals[i][1], curr[1]);
            }
            else{
                res.add(new ArrayList<>(Arrays.asList(curr[0], curr[1])));
                curr[0] = intervals[i][0];
                curr[1] = intervals[i][1];
            }
        }
        res.add(new ArrayList<>(Arrays.asList(curr[0], curr[1])));
        
        int[][] res1=new int[res.size()][2];
        for(int i=0;i<res1.length;i++){
            res1[i][0]=res.get(i).get(0);
            res1[i][1]=res.get(i).get(1);
        }
        return res1;
    }

    public boolean checkValidOverLap(int[] curr,int[][] intervals,int i){
        if(intervals[i][0]<=curr[1])return true;
        else return false;
    }
}