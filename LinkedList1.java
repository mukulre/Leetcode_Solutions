import java.util.*;
class LinkedList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
        int data, index;

        while (true) {
            System.out.println("----------List Menu----------");
            System.out.println("1. Adding the data");
            System.out.println("2. Get the data from specific index");
            System.out.println("3. Remove the data from specific index");
            System.out.println("4. Remove the specific data");
            System.out.println("5. Find the list size");
            System.out.println("6. Search");
            System.out.println("7. Inserting at a specific index");
            System.out.println("8. List check for empty");
            System.out.println("9. Find the index of the data");
            System.out.println("10. Clear the list");
            System.out.println("11. Display");
            System.out.println("12. Exit");
            System.out.println("-----------------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    numbers.add(data);
                    System.out.println("Added " + data + " to the list");
                    break;

                case 2:
                    System.out.print("Enter the index: ");
                    index = sc.nextInt();
                    if (index >= 0 && index < numbers.size())
                        System.out.println("Value at index " + index + " is " + numbers.get(index));
                    else
                        System.out.println("Invalid index!");
                    break;

                case 3:
                    System.out.print("Enter the index to remove: ");
                    index = sc.nextInt();
                    if (index >= 0 && index < numbers.size()) {
                        int removedValue = numbers.remove(index);
                        System.out.println("Removed value " + removedValue + " from index " + index);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter the data to remove: ");
                    data = sc.nextInt();
                    if (numbers.remove(Integer.valueOf(data)))
                        System.out.println("Value " + data + " is removed");
                    else
                        System.out.println("Value not found!");
                    break;

                case 5:
                    System.out.println("Size of the list: " + numbers.size());
                    break;

                case 6:
                    System.out.print("Enter the data to search: ");
                    data = sc.nextInt();
                    System.out.println("Contains " + data + "? " + numbers.contains(data));
                    break;

                case 7:
                    System.out.print("Enter the data to insert: ");
                    data = sc.nextInt();
                    System.out.print("Enter the index to insert: ");
                    index = sc.nextInt();
                    if (index >= 0 && index <= numbers.size()) {
                        numbers.add(index, data);
                        System.out.println("Inserted " + data + " at index " + index);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 8:
                    System.out.println("Is the list empty? " + numbers.isEmpty());
                    break;

                case 9:
                    System.out.print("Enter the data to search for index: ");
                    data = sc.nextInt();
                    int idx = numbers.indexOf(data);
                    if (idx != -1)
                        System.out.println(data + " is found at index " + idx);
                    else
                        System.out.println("Data not found!");
                    break;

                case 10:
                    numbers.clear();
                    System.out.println("Cleared the list!");
                    break;

                case 11:
                    System.out.println("List elements:");
                    System.out.println(numbers);
                    break;

                case 12:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
