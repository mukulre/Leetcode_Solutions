class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        int n = s.length();
    
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
            {
                stk.push(ch);
            }
            else
            {
                if(stk.isEmpty())
                {
                    return false;
                }
                char top = stk.pop();
                if((top=='('&&ch!=')')||(top=='['&&ch!=']')||(top=='{'&&ch!='}'))
                {
                    return false;
                }

            }
        }
        return stk.isEmpty();
    }
}