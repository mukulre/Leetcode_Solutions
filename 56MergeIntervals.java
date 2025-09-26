class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
            return a[0]==b[0]?a[1]-b[1]:a[0]-b[0];
        });
        int i=0;
        for(int j=0;j<intervals.length;){
            if(intervals[i][1]>=intervals[j][0]){
                intervals[i][0]=Math.min(intervals[i][0],intervals[j][0]);
                intervals[i][1]=Math.max(intervals[i][1],intervals[j][1]);
                j++;
            }
            else{
                i++;
                intervals[i]=intervals[j];
            }
        }
        return Arrays.copyOfRange(intervals,0,i+1);
    }
}