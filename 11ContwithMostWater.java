class Solution {
    public int maxArea(int[] height) {
        int max = 0 ;
        int l = 0;
        int area = 0;
        int b = 0;
        int s=0;
        int e = height.length-1;
while(s<e){

    l=Math.min(height[s],height[e]);
    b=e-s;
    area = l*b;
    max = Math.max(max,area);
    if(height[s]<height[e]){
        s++;
    }
    else{
        e--;
    }
}
return max;
 }
    
}