package reusing;

public class Exer1 {
    private Dog dog;
    public  String toString(){
        if (dog == null) {  // Initialize dog before using
            dog = new Dog();
        }
        return "Dog = " + dog;
    }
    public static void main(String[] args) {
        Exer1 exer1 = new Exer1();
        System.out.println(exer1);
    }
}

class Dog {
    private String s;
    Dog() {
        System.out.println("Dog()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}
