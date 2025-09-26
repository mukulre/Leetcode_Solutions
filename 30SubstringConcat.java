class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> ans = new ArrayList<>();
        int n1=words[0].length();
        int n2=s.length();

        Map<String,Integer> map1=new HashMap<>();
        for(String ch:words){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<n1;i++){
            int left=i,j=i,c=0;
            Map<String,Integer> map2=new HashMap<>();
            while(j+n1<=n2){
                String word1=s.substring(j,j+n1);
                j+=n1;
                if(map1.containsKey(word1)) {
                    map2.put(word1,map2.getOrDefault(word1,0)+1);
                    c++;
                    
                    while(map2.get(word1)>map1.get(word1)) {
                        String word2=s.substring(left,left+n1);
                        map2.put(word2,map2.get(word2)-1);
                        left+=n1;
                        c--;
                    }
                    
                   if (c==words.length) ans.add(left);
                }
                   else{
                      map2.clear();
                      c=0;
                      left=j;
                }
            }
        }
    
        return ans;    
    }
        
    //     int n=words[0].length();
    //     List<Integer> list =new ArrayList<>();
    //     HashMap<String,Integer> map=new HashMap<>();
    //     for(String ch:words){
    //         map.put(ch,map.getOrDefault(ch,0)+1);
    //     }
    //     int j=0,i=0,c=0;

    //     while(i<s.length()){
    //         String ch="";
    //         if(c==words.length&&check(map))list.add(i-c*n);
    //         if(j+n<s.length()) ch=s.substring(j,n-1);
    //         if(map.containsKey(ch)&&map.get(ch)>0){
    //             map.put(ch,map.get(ch)-1);
    //             i=(i+n)%s.length();
    //             i=j;
    //             c++;
    //         }
    //         else {
    //              map.replaceAll((key, value) -> 0);
    //     for(String word:words)map.put(word,map.getOrDefault(word,0)+1);
    //             i++;
    //             j++;
    //             c=0;
    //         }
    //     }
    //     return list;
    // }










// private boolean check(HashMap<String,Integer>map){
//         for(int a:map.values())if(a>=1)return false;
//         return true;
//     }
        // String ch="";
        // for(String s1:words)ch+=s1;
        // ArrayList<Integer>list=new ArrayList<>();
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(char c:s.toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }
        // int c=0;
        // for(int i=0;i<s.length();i++){
        //     if(c==ch.length()&&check(map))list.add(i-c);
        //     if(map.containsKey(s.charAt(i))&&map.get(s.charAt(i))>0){
        //         c++;
        //         map.put(s.charAt(i),map.get(s.charAt(i))-1);
        //     }
        //     else c=0;
        // }
        //  return list;
    }