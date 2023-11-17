package PrototypePattern;

public class Student implements Prototype {
    private String name;
    private int age;
    private double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public Prototype clone() { // responsibility of OBJECT class to create a clone
        return new Student(name,age,marks);
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", marks=" + marks +
            '}';
    }
}
