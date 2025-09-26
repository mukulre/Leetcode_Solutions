import java.util.*;
public class Main
{
    static int binary(int left,int right,int n,int[] nums){
        if(left<=right){
            int mid=left+(right-left)/2;
            if(n==nums[mid])
            return mid;
            else if(n<nums[mid])
            return binary(0,mid-1,n,nums);
            else if(n>nums[mid])
            return binary(mid+1,right,n,nums);
        }
        return 200;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner (System.in);
	    int []nums={2,3,4,5,22,33,44,55,66,77,88};
		System.out.println("Enter num to find its index");
		int n=sc.nextInt();
		int res=binary(0,10,n,nums);
		if (res!=200)
		System.out.println("Element found at "+res);
		else
		System.out.println("Element not found");
	}
}