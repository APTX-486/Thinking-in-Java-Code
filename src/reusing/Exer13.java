package reusing;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

class DoThings {
    void dot(int i) {
        System.out.println("dot(int)");
    }
    void dot(float f) {
        System.out.println("dot(float)");
    }
    void dot(char c) {
        System.out.println("dot(char)");
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}
public class Exer13 extends DoThings {
    void dot(Animal animal) {
        System.out.println("dot(Animal)");
    }

    public static void main(String[] args) {
        Exer13 exer13 = new Exer13();
        exer13.dot(11);
        exer13.dot(1.1f);
        exer13.dot('x');
        exer13.dot(new Animal());
    }
}
