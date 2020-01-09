package reusing;

public class Lisa extends Homer {
    @Override
    float doh(float f) {
        System.out.println("Lisa doh(float)");
        return 1.0f;
    }

    public static void main(String[] args) {
        Lisa lisa = new Lisa();
        lisa.doh(1.0f);
    }
}
