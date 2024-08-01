package hashmaps;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        
    HashMap<String, String> nicknames = new HashMap<>();
    nicknames.put("matthew", "matt");
    nicknames.put("michael", "mix");
    nicknames.put("arthur", "artie");

    System.out.println(nicknames.get("matthew"));
    }
}

/*
1. Direct Printing:

System.out.println(nicknames.get("matthew"));
This directly retrieves the value associated with the key "matthew" and prints it. It's concise and perfectly valid.

2. Using an Intermediate Variable:

String matthewsNickname = nicknames.get("matthew");
System.out.println(matthewsNickname);
This approach stores the retrieved value in a variable before printing it. It can make debugging easier because you can inspect the variable in a debugger or add additional processing or logging before printing.

Which One to Use?
- Direct Printing: Suitable for simple cases where you immediately use the retrieved value and there's no need for additional processing or debugging.
- Intermediate Variable: Useful if you plan to use the retrieved value multiple times, need to debug, or want to add more logic before using the value.

In summary, both methods are correct and will produce the same output. Choosing one over the other depends on the context and your preference for readability and debugging convenience.
 */
