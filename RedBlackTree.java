import java.util.PriorityQueue;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> x1=new PriorityQueue<>(Collections.reverseOrder());
		int[] arr={2,3,4,22,1,56,78,90,23};
		for(int a:arr)
		{
		    x1.add(a);
		}
		System.out.print(x1);
		while(!x1.isEmpty())
		{
		    System.out.print(x1.poll() +"");
		}
	}
}