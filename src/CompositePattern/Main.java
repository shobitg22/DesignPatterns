package CompositePattern;

public class Main {
    public static void main(String[] args) {
        Directory parentDirectory = new Directory();
        FileSystem fileSystem1 = new File();
        parentDirectory.add(fileSystem1);

        Directory childDirectory = new Directory();
        FileSystem fileSystem2 = new File();
        childDirectory.add(fileSystem2);

        parentDirectory.add(childDirectory);
        parentDirectory.ls();
    }
}
