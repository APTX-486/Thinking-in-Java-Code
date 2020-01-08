package reusing;

import com.sun.org.apache.bcel.internal.util.ClassQueue;

public class Exer2 extends Detergent {
    public void scrub() {
        append(" Exer2.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }
    public static void main(String[] args) {
        Exer2 exer2 = new Exer2();
        exer2.dilute();
        exer2.apply();
        exer2.scrub();
        exer2.foam();
        exer2.sterilize();
        System.out.println(exer2);
        System.out.println("Test base class Detergent.");
        Detergent.main(args);
    }
}
