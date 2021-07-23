package structural.proxy;

public class EbookProxy implements Ebook{
    private String fileName;
    private RealEbook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(ebook == null)
            ebook = new RealEbook(fileName); // Only gets the real ebook if necessary

        ebook.show(); // Proxying the real implementation to the real ebook.
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
