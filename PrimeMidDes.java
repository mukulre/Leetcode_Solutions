import java.util.*;
public class Main
{
    static boolean prime(int i)
    {  
        int fact=0;
       for(int t=2;t<i;t++)
       {
         if(i%t==0)
         fact++;
       }
       if(fact==0)
       return true;
       else 
       return false;
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i,res;
        int c=0;
        int j=0;
        int[] arr= new int[n];
        i=2;
        
        while(true)
        {
             
             if(prime(i))
             {
                 arr[j]=i;
                 c++;
                 j++;
             }
             
             i++;
             if(c==n)
             break;
            
        }
        
        Arrays.sort(arr);
        int len1=arr.length;
        for(int z=0;z<len1/2;z++)
        {
            System.out.print(arr[z]+" ");
        }
        for(int x=len1-1;x>len1/2;x--)
        {
            System.out.print(arr[x]+" ");
        }
		
	}
 }