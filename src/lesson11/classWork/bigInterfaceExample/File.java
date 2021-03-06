package lesson11.classWork.bigInterfaceExample;

public class File {
    private String name;
    private String path;
    private String extansion;
    private int size;

    public File(String name, String path, String extansion, int size) {
        this.name = name;
        this.path = path;
        this.extansion = extansion;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getExtansion() {
        return extansion;
    }

    public int getSize() {
        return size;
    }
}
