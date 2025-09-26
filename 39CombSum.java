class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        makecomb(candidates,target,res,0,new ArrayList<>(),0);
        return res;
    }
    public static void makecomb(int[] arr,int target,List<List<Integer>>res,int ind,List<Integer>comb,int total){
        if(total==target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total>target || ind>=arr.length){
            return;
        }
        comb.add(arr[ind]);
        makecomb(arr,target,res,ind,comb,total+arr[ind]);
        comb.remove(comb.size()-1);
        makecomb(arr,target,res,ind+1,comb,total);
    }
}