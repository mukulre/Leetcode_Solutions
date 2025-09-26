import java.util.Scanner;

public class print{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
}
int ele=sc.nextInt();
boolean found=false;
int count=0;
for(int i=0;i<n;i++){
   if(arr[i]==ele){
       System.out.print("found: "+i);
	   System.out.println("Enter the number to be replaced");
	   int replace = sc.nextInt();
	   arr[i]=replace;
	   System.out.println(arr[i]);
       found=true;
	   count+=1;
       break;
   }
}
System.out.println("number of elements replaced:"+count);
if(!found){
    System.out.print("not found");
}
}
}