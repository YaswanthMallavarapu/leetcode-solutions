class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        int merged[][]=new int [n][2];
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        merged[0][0]=intervals[0][0];
        merged[0][1]=intervals[0][1];
        int j=0;
        for(int i=1;i<n;i++){
            int firstStart =merged[j][0];
            int firstEnd=merged[j][1];
            int secondStart=intervals[i][0];
            int secondEnd=intervals[i][1];

            if(firstEnd>=secondEnd ){
                continue;
            }
            else if(firstEnd>=secondStart)
            merged[j][1]=secondEnd;
            else{
                j++;
                merged[j][0]=secondStart;
                merged[j][1]=secondEnd;
            }
        }
        j++;
        int merged_2[][]=Arrays.copyOf(merged,j);
        return merged_2;
        
    }
}