class Solution {
    public int search(int[] nums, int target) {
        int peak = max(nums);
        System.out.println(peak);
        //return peak;
        int first = search(nums, target, 0, peak);
        System.out.println(first);
        if(first!=-1){
            return first;
        }
        int second = search(nums, target, peak+1, nums.length-1);
        System.out.println(second);
        return second;
    }
    public int max(int[] arr) {
        int start = 0; 
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]) {
                return mid; 
            }

            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; 
    }
    public int search(int[] arr, int target, int start, int end) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
        
}