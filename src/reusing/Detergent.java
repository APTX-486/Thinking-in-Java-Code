package reusing;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" delute()");}
    public void apply() { append(" apply()");}
    public void scrub() { append(" scrub()");}
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute(); cleanser.apply(); cleanser.scrub();
        System.out.println(cleanser);
    }
}

public class Detergent extends Cleanser {

    // Change a method
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }
    // Add new methods
    public void foam() {
        append(" foam()");
    }
    // Test the new class
    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println("Test base class: ");
        Cleanser.main(args);
    }
}
