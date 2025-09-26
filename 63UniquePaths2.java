class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[] prev=new int[n];

        for(int i=0;i<m;i++){
            int[] temp=new int[n];
            for(int j=0;j<n;j++){
              if(obstacleGrid[i][j]!=1){
                 if(i==0 && j==0){
                    temp[j]=1;
                    continue;
                }
                    int up=0;
                    int left=0;
                    if(i>0) {
                        up=prev[j];
                    }
                    if(j>0){
                        left=temp[j-1];
                    }
                    temp[j]=up+left;      
                }
                else{
                    continue;
                }
               
            }
            prev=temp; 
        }
        return prev[n-1];
    }
}