package BuilderPattern;

import java.util.List;

public class MBAStudent extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        this.subject = List.of("Commerce","Maths");
        return this;
    }
}
