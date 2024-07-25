/*
 * Implement the class Items described here. NB! Don't modify the class Item.
Write a program that reads names of items from the user. If the name is empty, the program stops reading. 
Otherwise, the given name is used to create a new item, which you will then add to the items list.
Having read all the names, print all the items by using the toString method of the Item class. 
The implementation of the Item class keeps track of the time of creation, in addition to the name of the item.
 */

public class Items {

    public static void main(String[] args) {
   

import java.util.ArrayList;
import java.util.Scanner;

       ArrayList<Item> items = new ArrayList<>();

        // create a scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // prompt the used to enter an item name
            System.out.print("Name: ");
            String name = scanner.nextLine();

            // If the name is empty, break the loop
            if (name.isEmpty()) {
                break;
            }

            // create a new item object with the entered name
            Item item = new Item(name);

            // add the item object to the list
            Item.add(item);
        }

        scanner.close();

        // print out all items using their toString method
        for (Item item : items) {
            System.out.println(item);
        }
    }
}