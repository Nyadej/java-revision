/*
 * Modify the classes so that class B inherits class A, and class C inherits class B. 
 * In other words, class A will be a superclass for class B, and class B will be a superclass for class C.
 */

public class A2 {
    public void a() {
        System.out.println("A");
    }
}

public class B extends A{

    public void b() {
        System.out.println("B");
    }
}

public class C extends B {

    public void c() {
        System.out.println("C");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.a(); // Inherited from A, prints "A"
        c.b(); // Inherited from B, prints "B"
        c.c(); // Defined in C, prints "C"
    }
}
