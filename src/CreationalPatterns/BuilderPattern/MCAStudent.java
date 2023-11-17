package BuilderPattern;

import java.util.List;

public class MCAStudent extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        this.subject = List.of("DSA","OS");
        return this;
    }
}
