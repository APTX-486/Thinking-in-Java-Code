package reusing;

class Person {
    private String name;
    Person(String n) {
        name = n;
        System.out.println("Person conctructor with person name = " + name);
    }
}

class Student extends Person {
    private String school;
    Student() {
        super("tom");
        System.out.println("Default Student conctructor");
    }
    Student(String s) {
        super("john");
        school = s;
        System.out.println("Student  conctructor with args");
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println();
        Student student2 = new Student("Harvord");
    }
}
public class Exer8 {

}
