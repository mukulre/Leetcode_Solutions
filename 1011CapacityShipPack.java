class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int left=getMax(weights);
        int right=getSum(weights);

        while(left<right){
            int mid=left+(right-left)/2;
            if(canShip(weights,D,mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    private boolean canShip(int[] weights,int D,int capacity){
        int days=1;
        int curr=0;

        for(int w:weights){
            if(curr+w>capacity){
                days++;
                curr=0;
            }
            curr+=w;
        }
        return days<=D;
    }
    private int getMax(int[] arr){
        int max=arr[0];
        for(int val:arr) max=Math.max(max,val);
        return max;
    }
    private int getSum(int[] arr){
        int sum=0;
        for(int val:arr) sum+=val;
        return sum;
    }
}