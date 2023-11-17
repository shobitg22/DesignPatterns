package BuilderPattern;

public class Director {

    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student getStudent(){
        if(studentBuilder instanceof MCAStudent){
            return MCAStudent();
        }
        if (studentBuilder instanceof MBAStudent){
            return MBAStudent();
        }
        return null;
    }

    private Student MBAStudent(){
        return studentBuilder
            .setName("shobit")
            .setAge(24)
            .setGender(Gender.MALE)
            .setSubject()
            .build();

    }
    private Student MCAStudent(){
        return studentBuilder
            .setName("gaurav")
            .setAge(24)
            .setGender(Gender.MALE)
            .setSubject()
            .build();
    }
}
