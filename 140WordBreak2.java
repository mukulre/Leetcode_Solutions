import java.util.*;
public class 140WordBreak2{
    public List<String> wordBreak(String s, List<String> wordDict){
        Set<String> dict=new HasSet<>(wordDict);
        Map<String, List<String>> memo=new HashMap<>();

        return wordBreakHelper(s, dict,memo);
    }
    private List<String> wordBreakHelper(String s, Set<String> dict,Map<String,List<String>> memo){
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        List<String>result=new ArrayList<>();
        for(int i=1;i<=s.length();i++){
            String prefix=s.substring(0,i);
            if(dict.contains(prefix)){
                if(i==s.length()){
                    result.add(prefix);
                }else{
                    String suffix=s.substring(i);
                    List<String> suffixSentences=wordBreakHelper(suffix,dict,memo);
                    for(String suffixSentence:suffixSentences){
                        result.add(prefix+" "+suffixSentence);
                    }
                }
            }
        }
        memo.put(s,result);
        return result;
    }
}