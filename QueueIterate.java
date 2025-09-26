import java.util.Queue;
import java.util.LinkedList;

public class Main 
{
    public static void calculate(int [] tasks,int time)
    {
        Queue<Integer> n = new LinkedList<>();
        for(int task:tasks)
        {
            n.add(task);
        }
        System.out.println(n);
    }
    public static void main(String[] args) 
    {
        int [] tasks ={10,4,2,6};
        int time=3;
        calculate(tasks,time);
    }
}