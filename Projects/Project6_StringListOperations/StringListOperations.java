package Project6_StringListOperations;

import java.util.*;

public class StringListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> itemList = new ArrayList<>();

        int choice;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to be inserted: ");
                    String newItem = sc.nextLine();
                    itemList.add(newItem);
                    System.out.println("Inserted successfully\n");
                    break;

                case 2:
                    System.out.print("Enter the item to search: ");
                    String searchItem = sc.nextLine();
                    if (itemList.contains(searchItem))
                        System.out.println("Item found in the list.\n");
                    else
                        System.out.println("Item not found in the list.\n");
                    break;

                case 3:
                    System.out.print("Enter the item to delete: ");
                    String deleteItem = sc.nextLine();
                    if (itemList.remove(deleteItem))
                        System.out.println("Deleted successfully\n");
                    else
                        System.out.println("Item does not exist.\n");
                    break;

                case 4:
                    if (itemList.isEmpty()) {
                        System.out.println("List is empty.\n");
                    } else {
                        System.out.println("The Items in the list are :");
                        for (String item : itemList)
                            System.out.println(item);
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.\n");
            }

        } while (choice != 5);

        sc.close();
    }
}
