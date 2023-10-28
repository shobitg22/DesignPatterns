package BuilderPattern;

import java.util.List;

public abstract class StudentBuilder {

    private String name;
    private int age;
    private Gender gender;
    List<String> subject;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    abstract public StudentBuilder setSubject() ;

    public Student build(){
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public List<String> getSubject() {
        return subject;
    }
}
