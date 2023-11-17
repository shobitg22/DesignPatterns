package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    List<FileSystem> fileSystems = new ArrayList<>();
    void add(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }
    @Override
    public void ls() {
        fileSystems.forEach(FileSystem::ls);
    }
}
