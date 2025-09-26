import java.util.*;
public class Main{
    static void res(int target,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("The num found in "+i+ " index");
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,12,34,1,-2,4};
        int target;
        System.out.println("Enter num to find its place/position");
        target=sc.nextInt();
        res(target,arr);
    }
}