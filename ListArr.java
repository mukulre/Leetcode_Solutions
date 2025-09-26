import java.util.*;
public class ListArr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        int data;//if we are not declaring here while using the same variable multiple times insides switch we will get error.
        int index;
        while(true){
            System.out.println("-----------------List Menu-----------------");
            System.out.println("1. Adding the element: ");
            System.out.println("2. Getting the element from specific index: ");
            System.out.println("3. Remove the element from specific index: ");
            System.out.println("4. Remove the specific element");
            System.out.println("5. Find the list size: ");
            System.out.println("6. Search the element");
            System.out.println("7. Inserting the element at specific index: ");
            System.out.println("8. List check for empty: ");
            System.out.println("9. Find the index of the element");
            System.out.println("10. clear the list");
            System.out.println("11. Display");
            System.out.println("12. Exit");
            System.out.println("--------------------------------------------");

            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the element: ");
                    data=sc.nextInt();
                    numbers.add(data);
                    System.out.println("Adding "+data+"  to the list");
                    break;
                case 2:
                    System.out.print("Enter the index: ");
                    index=sc.nextInt();
                    System.out.println("Value at index "+index+"  is"+numbers.get(index));
                    break;
                case 3:
                    System.out.print("Enter the index to remove: ");
                    index=sc.nextInt();
                    System.out.println("Value at index "+index+"  is"+numbers.remove(index)+" removed");
                    break;
                case 4:
                    System.out.print("Enter the data to remove: ");
                    data=sc.nextInt();
                    System.out.println("Value at index "+ data +"  is"+numbers.remove(Integer.valueOf(data))+" removed");
                    break;
                case 5:System.out.println("size of the lsit: "+numbers.size());
                case 6:
                    System.out.print("Enter the data to remove: ");
                    data=sc.nextInt();
                    System.out.println("Contains "+data+"? "+numbers.contains(data));
                    break;
                case 7:
                    System.out.println("Enter the index to insert: ");
                    index=sc.nextInt();
                    System.out.print("Enter the index: ");
                    data=sc.nextInt();
                    numbers.set(index,data);
                    System.out.println("Inserted "+data+"  at the index"+index);
                    break;
                case 8:
                    System.out.println("Is the list empty?" +numbers.isEmpty());
                    break;
                case 9:
                    System.out.println("Enter the data to search for the given index: ");
                    data=sc.nextInt();
                    System.out.println(data+" found at index "+numbers.indexOf(data));
                case 10:
                    numbers.clear();
                    System.out.println("Cleared the list!");
                    break;
                case 11:System.out.print(numbers);
                case 12:
                    System.out.println("Existing...");
                    System.exit(0);
                default:System.out.println("Invalid choice");

            }
        }
       
    }
}