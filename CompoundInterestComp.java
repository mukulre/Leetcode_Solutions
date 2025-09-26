import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long P=sc.nextLong();
        double R=sc.nextDouble();
        int T=sc.nextInt();
        double A=P*Math.pow((1+R/100),T);
        long compoundInterest = (long) (A-P);
        System.out.println(compoundInterest);
        sc.close();
    }
}