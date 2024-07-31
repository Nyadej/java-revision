/*Create the following three classes:

Class A. Class should have no object variables nor should you specify a constructor for it. It only has the method public void a(), which prints a string "A".
Class B. Class should have no object variables nor should you specify a constructor for it. It only has the method public void b(), which prints a string "B".
Class C. Class should have no object variables nor should you specify a constructor for it. It only has the method public void c(), which prints a string "C".
*/

public class A {

    public void a() {
        System.out.println("A");
    }
}

public class B {

    public void b() {
        System.out.println("B");
    }
}

public class C {

    public void c() {
        System.out.println("C");
    }
}

public class Main {
    public static void main(String[] args) {
        A aInstance = new A();
        aInstance.a(); // Prints "A"

        B bInstance = new B();
        bInstance.b(); // Prints "B"

        C cInstance = new C();
        cInstance.c(); // Prints "C"
    }
}


