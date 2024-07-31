/*
Create a class Student, which inherits the class Person.

At creation, a student has 0 study credits. Every time a student studies, the amount of study credits goes up. The class must act as follows:

Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
System.out.println(ollie);
System.out.println("Study credits " + ollie.credits());
ollie.study();
System.out.println("Study credits "+ ollie.credits());
*/

public class Student extends Person {
    private int credits;

    public Student (String name, String address) { // constructor only takes name and address as parameters
        super(name, address);
        this.credits = 0; // doesn't accept credits as a parameters since its is always initialised to 0
    }

    private int getCredits() { // public to allow external code to access the number of credits a student has
        return credits;
    }

    public void study() { // void because it is performing an action and does not need to return a value
        credits++;
    }

    @Override
    public String toString() { // calls the superclass's toString method, and adds the study credits to it 
        return super.toString() + ", study credits " + credits;
    }    
}

/*
 * In the previous task, Studentinherits the toString method from the class Person. However, you can also overwrite an inherited method, replacing it with your own version. Write a version of toString method specifically for the Student class. The method must act as follows:

Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
System.out.println(ollie);
ollie.study();
System.out.println(ollie);

@Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits;
}
 */
