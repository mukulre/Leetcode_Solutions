import java.util.ArrayList;
public class ArrListOps
{
	public static void main(String[] args) 
	{
	   ArrayList<Integer>num=new ArrayList<>();
	   num.add(10);
	   System.out.print("Element at index 2:"+num.get(2));
	   num.set(1,25);
	   num.remove(3);
	   num.remove(Integer.valueOf(50));
	   System.out.println("Contains 25?"+num.contains(25));
	   System.out.println("Index of 30:?"+num.indexOf(30));
	   System.out.println("Size of list?"+num.size());
	   System.out.println("Is the list empty?"+num.isEmpty());
	   num.clear();
	    
	}
}