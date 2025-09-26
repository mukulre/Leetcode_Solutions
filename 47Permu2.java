class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        boolean[] arr=new boolean[nums.length];
        backTrack(l,nums,new ArrayList<>(),arr);
        return l;
    }
    private void backTrack(List<List<Integer>> l,int[] nums,List<Integer> perm,boolean[] arr){
        if(perm.size()==nums.length){
            List<Integer> ls=new ArrayList<>(perm);
            if(!l.contains(ls)){
                l.add(ls);
            }
            return;
        }
            for(int i=0;i<nums.length;i++){
                if(arr[i]){
                    continue;
                }
                perm.add(nums[i]);
                arr[i]=true;
                backTrack(l,nums,perm,arr);
                arr[i]=false;
                perm.remove(perm.size()-1);
            }
    }
}