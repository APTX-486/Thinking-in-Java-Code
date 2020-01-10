package polymorphism;

public class PrivateOverride {
    private void f() {
        System.out.println("Private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("Public F()");
    }
}
