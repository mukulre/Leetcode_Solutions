import java.util.*;
class Operation 
{
    public static int calculate(int n) 
    {
        int sum = 0;
        while (n > 0) 
        {
            int digit = n % 10;         
            sum += digit * digit;       
            n /= 10;                    
        }
        return sum;
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> seen = new ArrayList<>();  
        
        System.out.println("Enter Integer:");
        int n = sc.nextInt();
        
        while (true) 
        {
            n = Operation.calculate(n);  // Apply the operation
            if (n == 1) {
                System.out.println("True");  // Reaches 1: Happy Number
                break;
            }
            if (seen.contains(n)) 
            {
                System.out.println("False");  // Cycle detected: Not a Happy Number
                break;
            }
            seen.add(n);  // Track numbers to detect cycles
        }
        
        sc.close();  // Close the Scanner
    }
}