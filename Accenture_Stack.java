import java.util.*;
public class Main
{
    public static int compare(char ch)
    {
        switch(ch)
        {
            case '+':
                return 1;
            case '-': 
                return 1;
            case '*':
                return 2;
            case '/': 
                return 2;
            
        }
        return 0;
    }
    
    public static int process(int a,int b,char ch)
    {
        switch(ch)
        {
            case '+':
                return a+b;
            
            case '-':
                return a-b;
            
            case '*':
                return a*b;
            
            case '/':
                return a/b;
            
        }
        return 0;
    }
    
    
    public static int eval(String S)
    {
        Stack<Integer> nums=new Stack<>();
        Stack<Character> symbol=new Stack<>();
        
        int i=0;
        while(i<S.length())
        {
            if(Character.isDigit(S.charAt(i)))
            {
                int n=0;
                while(i<S.length() && Character.isDigit(S.charAt(i)))
                {
                    n=n*10+(S.charAt(i)-'0');
                    i++;
                }
                nums.push(n);
            }
            else
            {
                while(!symbol.isEmpty() && compare(symbol.peek())>=compare(S.charAt(i)))
                {
                    char ch=symbol.pop();
                    int n2=nums.pop();
                    int n1=nums.pop();
                    nums.push(process(n1,n2,ch));
                }
                symbol.push(S.charAt(i));
                i++;
            }
        }
        
        while(!symbol.isEmpty())
        {
            char ch=symbol.pop();
            int n2=nums.pop();
            int n1=nums.pop();
            nums.push(process(n1,n2,ch));
        }
        
        return nums.pop();
    }
    
	public static void main(String[] args) 
	{
		System.out.println(eval("100/3/4"));
		System.out.println(eval("100+2/5+10-3"));
	}
}