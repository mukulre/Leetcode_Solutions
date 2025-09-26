import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int totalProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                totalProfit += prices[i] - prices[i-1];
            }
        }
        return totalProfit;
    }
}