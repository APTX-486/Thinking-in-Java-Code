package reusing;

class Component1 {
    Component1(int i) {
        System.out.println("Component1 constructor");
    }
}
class Component2 {
    Component2(int i) {
        System.out.println("Component2 constructor");
    }
}
class Component3 {
    Component3(int i) {
        System.out.println("Component3 constructor");
    }
}
class Root {
    private Component1 component1 = new Component1(11);
    private Component2 component2 = new Component2(11);
    private Component3 component3 = new Component3(11);
    Root(int i) {
        System.out.println("Root constructor");
    }
}

class Stem extends Root {
    Stem(int i) {
        super(i);
        System.out.println("Stem constructor");
    }

    public static void main(String[] args) {
        Stem stem = new Stem(11);
    }
}
public class Exer9 {
    public static void main(String[] args) {
        Stem stem = new Stem(11);
    }
}
