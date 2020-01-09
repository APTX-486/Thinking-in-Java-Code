package reusing;

class Instrument {
    public void play() {}
    static void tune(Instrument i) {  // static is must
        // ...
        i.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
