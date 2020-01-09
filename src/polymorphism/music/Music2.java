package polymorphism.music;

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
}

class Brass extends Instrument {
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
}
public class Music2 {
    static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }
    static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }
    static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn );
    }
}