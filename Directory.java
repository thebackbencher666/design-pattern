import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private int size;
    private List<FileSystemComponent> childrens;

    

    public Directory() {
        this.size = 0;
        childrens = new ArrayList<>();
    }

    public void add(FileSystemComponent component){
        childrens.add(component);
    }

    @Override
    public int fs() {
        for (FileSystemComponent component : childrens) {
            size += component.fs();
        }
        return size;
    }

}
