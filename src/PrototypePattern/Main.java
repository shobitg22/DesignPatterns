package PrototypePattern;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Shobit",24,10);
        // if we don't use Prototype pattern, then we have to implicitly copy each field value to clone object inside main class,
        // and what if we have private members and what if we have 100 properties, so it's better to give responsibility to object class only
        Student clone = (Student) student.clone();

        System.out.println("Original:- "+student);
        System.out.println("Clone:- "+clone);
    }
}