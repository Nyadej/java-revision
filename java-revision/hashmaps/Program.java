package hashmaps;

import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String, String> hashmap) {
        // Iterate through all keys in the HashMap and print each one.
        for (String key : hashmap.keySet()) { // Loop through keys: Use a loop to go through all the keys in the hashmap and print each one.
            System.out.println(key); // Ensure it prints all keys from the provided hashmap
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        // Iterate through all keys and print those that contain the specified substring.
        for (String key : hashmap.keySet()) { // Use a loop to go through all the keys in the hashmap.
            if (key.contains(text)) { // Use the contains method of String to check if the key includes the substring.
                System.out.println(key); // We loop through the keys and check if each key contains the given substring. If it does, we print it.
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        // Iterate through all keys, and for keys containing the specified substring, print the corresponding values.
        for (String key : hashmap.keySet()) { // Use a loop to go through all the keys in the hashmap.
            if (key.contains(text)) { // Check the key with contains, and then use hashmap.get(key) to retrieve and print the value.
                System.out.println(hashmap.get(key)); // We loop through the keys and check if each key contains the given substring. If it does, we print the corresponding value (meaning).
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    } 
}
