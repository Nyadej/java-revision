/*
 * Create a class Person. The class must work as follows:

Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
System.out.println(ada);
System.out.println(esko);
 */

public class Person {
    private String name;
    private String address;

    public Person (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override // By overriding the toString method, you can return a string that contains relevant information about the object's state
    public String toString() {
        return name + ", " + address;
    }
}

/*
 * without @overriding the toString method the output - Person@15db9742 is not helpful because it doesn't convey any meaningful information about the Person object.
 * By overriding the toString method, you can return a string that contains relevant information about the object's state
 * 
1. Custom Representation: The overridden toString method provides a string that includes the name and address of the Person, which is much more informative than the default representation.
2. Readability: When objects are printed or logged, the custom toString output improves readability and understanding of the object's state.
3. Debugging: Overridden toString methods are extremely helpful during debugging, as they allow developers to quickly inspect the values of an object's fields.

In summary, overriding the toString method is a common practice in Java to ensure that objects are represented in a clear and meaningful way when they are printed or logged.
 
 * In the previous task, Studentinherits the toString method from the class Person. However, you can also overwrite an inherited method, replacing it with your own version. Write a version of toString method specifically for the Student class. The method must act as follows:

Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
System.out.println(ollie);
ollie.study();
System.out.println(ollie);

@Override
    public String toString() {
        return name + "\n  " + address;
    }
 */
