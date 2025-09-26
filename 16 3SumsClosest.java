class Solution {
    public int threeSumClosest(int[] a, int target) {
        int n = a.length;
        Arrays.sort(a);
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0; i<n; i++){
            if(i > 0 && a[i] == a[i-1]) continue;
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = a[i] + a[j] + a[k];
                if(sum < target){
                    j++;
                }else if(sum > target){
                    k--;
                }else{
                    return target;
                }

                if(minDiff > Math.abs(sum-target)){
                    minDiff = Math.abs(sum-target);
                    ans = sum;
                }
            }
        }

        return ans;
    }
}