package polymorphism.shape;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

public class RandomShapeGenerator {
    private Random rand = new Random(47); // int number is seed, in the algorithm the random number
    // is completely determined by the seed
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 6: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    public static void main(String[] args) {
        RandomShapeGenerator r = new RandomShapeGenerator();
        System.out.println(r.next());
    }
}
