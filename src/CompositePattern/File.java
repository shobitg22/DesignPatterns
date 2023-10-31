package CompositePattern;

public class File implements FileSystem{

    @Override
    public void ls() {
        System.out.println("FILE ");
    }
}
