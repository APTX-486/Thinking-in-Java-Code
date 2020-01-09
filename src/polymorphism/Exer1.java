package polymorphism;

class Cycle {
    void ride() {
        System.out.println("Cycle.ride()");
    }
}

class Unicycle extends Cycle {
    void ride() {
        System.out.println("Unicycle.ride()");
    }
}

class Bicycle extends Cycle {
    void ride() {
        System.out.println("Bicycle.ride()");
    }
}

class Tricycle extends Cycle {
    void ride() {
        System.out.println("Tricycle.ride()");
    }
}

public class Exer1 {
    static void move(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        move(unicycle);
        move(bicycle);
        move(tricycle);
    }
}
