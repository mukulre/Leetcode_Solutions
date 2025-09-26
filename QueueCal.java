
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void calculate(int[] tasks, int time) {
        Queue<Integer> n = new LinkedList<>();
        for(int a : tasks) {
            n.add(a);
        }
        
        int totalTimeUsed = 0;
        int tasksCompleted = 0;
        
        // Process tasks while queue isn't empty and we have time
        while(!n.isEmpty()) {
            int temp = n.poll();  // Remove and get first task
            
            // Check if we have enough time to complete this task
            if(totalTimeUsed + temp <= time) {
                totalTimeUsed += temp;
                tasksCompleted++;
                System.out.println("Completed task of duration " + temp + 
                                 ", Total time used: " + totalTimeUsed);
            } else {
                System.out.println("Not enough time for task " + temp + 
                                 ". Remaining tasks: " + n.size() + 
                                 ", Time left: " + (time - totalTimeUsed));
                // Add remaining tasks back if needed
                n.add(temp);
                break;
            }
        }
        
        System.out.println("Tasks completed: " + tasksCompleted);
        System.out.println("Total time used: " + totalTimeUsed);
        System.out.println("Remaining tasks: " + n);
    }
    
    public static void main(String[] args) {
        int[] tasks = {10, 4, 2, 6};
        int time = 3;
        calculate(tasks, time);
    }
}