package structural.proxy;

// Example = Ebook library

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook){
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void open(String filename){
        ebooks.get(filename).show();
    }

}
