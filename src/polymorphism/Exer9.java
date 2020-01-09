package polymorphism;

import java.util.Random;

class Rodent {
    void cry() {
        System.out.println("Rodent.cry()");
    }
}

class Mouse extends Rodent {
    void cry() {
        System.out.println("Mouse.cry()");
    }
}

class Gerbil extends Rodent {
    @Override
    void cry() {
        System.out.println("Gerbil.cry()");
    }
}

class Hamster extends Rodent {
    @Override
    void cry() {
        System.out.println("Hamster.cry()");
    }
}

class RandomRodentGenerator {
    private Random random = new Random();
    Rodent next() {
        switch (random.nextInt(3)) {
            default:
            case 0: return new Mouse();
            case 1: return new Gerbil();
            case 2: return new Hamster();
        }
    }
}
public class Exer9 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void sound(Rodent r) {
        r.cry();
    }
    public static void soundAll(Rodent[] rodents) {
        for (Rodent i : rodents) {
            i.cry();
        }
    }

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[5];
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = gen.next();
        }
        soundAll(rodents);
    }
}
