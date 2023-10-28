package BuilderPattern;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    List<String> subject;

    public Student(StudentBuilder studentBuilder){
        this.subject = studentBuilder.getSubject();
        this.gender = studentBuilder.getGender();
        this.age = studentBuilder.getAge();
        this.name = studentBuilder.getName();
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", gender=" + gender +
            ", subject=" + subject +
            '}';
    }
}
