package reusing;
/*
    Cleanser is a class in another .java file with default access control, so it can be used by class
    TestCleaner in the same package.
 */
public class TestCleanser extends Cleanser {
    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.scrub();
        cleanser.apply();
        cleanser.dilute();
        System.out.println(cleanser);
    }
}
