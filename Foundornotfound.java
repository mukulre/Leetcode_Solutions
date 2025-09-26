import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
}
int ele=sc.nextInt();
boolean found=false;
for(int i=0;i<n;i++){
   if(arr[i]==ele){
       System.out.print("found: "+i);
       found=true;
       break;
   }
}
if(!found){
    System.out.print("not found");
}
}
}