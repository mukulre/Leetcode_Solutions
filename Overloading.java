class Calculator
{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Main{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 num: " +calc.add(5,10));
        System.out.println("Sum of 3 num: " +calc.add(5,10,15));   
    }
}