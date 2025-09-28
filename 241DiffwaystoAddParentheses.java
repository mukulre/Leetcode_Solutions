class Solution {
    Map<String, List<Integer>> memo=new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if(memo.containsKey(expression)) return memo.get(expression);

        List<Integer> result=new ArrayList<>();

        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);

            if(c=='+' || c=='-' || c=='*'){
                List<Integer> left=diffWaysToCompute(expression.substring(0,i));
                List<Integer> right=diffWaysToCompute(expression.substring(i+1));

                for(int l:left){
                    for(int r:right){
                        if(c=='+') result.add(l+r);
                        else if(c=='-') result.add(l-r);
                        else if(c=='*') result.add(l*r);
                    }
                }
            }
        }
        if(result.isEmpty()){
            result.add(Integer.valueOf(expression));
        }
        memo.put(expression, result);
        return result;
    }
}