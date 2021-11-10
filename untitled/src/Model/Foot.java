package untitled.src.Model;
public class Foot {
    private String arch,size,width;
    public Foot(String arch, String size, String width) {
        this.arch = arch;
        this.size = size;
        this.width = width;

    }

    public Foot() {
        arch = "arch";
        size = "size";
        width = "width";

    }
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWidth() {return width; }

    public void setWidth(String width) {
        this.width = width;
    }



    @Override
    public String toString(){
        return "Arch: " + getArch() + " Size: " + getSize() + " Width:" + getWidth();
    }
}
