public class A {

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

