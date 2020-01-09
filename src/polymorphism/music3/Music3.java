package polymorphism.music3;

import polymorphism.music.Note;

import java.time.chrono.IsoChronology;
import java.util.Random;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }
    String what() {
        return "Instrument";
    }
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
    String what() {
        return "Wind";
    }
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }
    String what() {
        return "Percussion";
    }
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
    String what() {
        return "Stringed";
    }
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    String what() {
        return "Brass";
    }
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }
    String what() {
        return "Woodwind";
    }
    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}

class RandomInstrumentGenerator {
    // a random generator can be used for generate random instruments
    private Random random = new Random();
    public Instrument next() {
        switch (random.nextInt(5)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Woodwind();
            case 4: return new Brass();
        }
    }
}
public class Music3 {
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    // gen is used in static method main, must be static
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[7];
        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = gen.next();
        }
        tuneAll(instruments);
    }
}
