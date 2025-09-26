class Factorial{
    static int fact(int a){
        if(a==1) return 1;
        return a*fact(a-1);
        
    }
    public static void main(String[] args){
        int n=5,r=3;
        System.out.println(fact(n)/(fact(r)*fact(n-r)));
    }
}