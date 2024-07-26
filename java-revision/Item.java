/*
 * Implement the class Items described here. NB! Don't modify the class Item.
Write a program that reads names of items from the user. If the name is empty, the program stops reading. 
Otherwise, the given name is used to create a new item, which you will then add to the items list.
Having read all the names, print all the items by using the toString method of the Item class. 
The implementation of the Item class keeps track of the time of creation, in addition to the name of the item.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private String name;
    private LocalDateTime createdAt; // LocalDateTime represents a date and time without a time zone

    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now(); // LocalDateTime.now() gets the current date and time according to the system clock
    }

    @Override // overrides the method in parent
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy HH:mm:ss");
        return this.name + " (created at: this.createdAt.format(formatter) + ")";
    }
}