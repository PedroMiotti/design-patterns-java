package structural.proxy;

public class RealEbook implements Ebook{
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Load ebook " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Show ebook " + fileName);

    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
