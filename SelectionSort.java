public class Main
{
    static void selection(int n,int[] nums){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
            if(nums[j]<nums[min])
            min=j;
        }
        int temp=nums[min];
        nums[min]=nums[i];
        nums[i]=temp;
        }  
    }
	public static void main(String[] args) {
	    int []nums={23,12,5,7,90,22,55,16,89};
		selection(9,nums);
		for(int a:nums){
		System.out.println(a+" ");   
		}
	}
}