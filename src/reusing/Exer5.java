package reusing;
/*
    exer5 and 7
 */
class A {
    A() {
        System.out.println("Default A constructor");
    }
    A(int i) {
        System.out.println("A Constructor with args");
    }
}
class B {
    B(int i) {
        System.out.println("B Constructor");
    }
}

class C extends A {
    C(int i) {
        super(i);
        B b = new B(i);
        System.out.println("C constructor");
    }

    public static void main(String[] args) {
        C c = new C(11);
    }
}

public class Exer5 {
    public static void main(String[] args) {
        C c = new C(11);
    }
}
