import java.util.PriorityQueue;
class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> x1 = new PriorityQueue<>((a, b) -> b - a);
        for(int num : nums)
        {
            x1.offer(num);
        }
        for(int i = 1; i < k; i++)
        {
            x1.poll();
        }
        return x1.peek();  
    }
}