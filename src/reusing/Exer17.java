package reusing;

class Amphibian {
    void forward() {
        System.out.println(this);
    }
    static void move(Amphibian amphibian) {
        amphibian.forward();
    }
    public String toString() {
        return "Amphibian move";
    }
}

class Forg extends Amphibian {
    public static void main(String[] args) {
        Forg forg = new Forg();
        forg.move(forg);
    }
    public String toString() {
        return "Forg move";
    }
}
public class Exer17 {
}
