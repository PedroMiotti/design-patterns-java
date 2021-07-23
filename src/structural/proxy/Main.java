package structural.proxy;

public class Main {
    public static void main(String[] args){
        Library library = new Library();
        String[] filenames = { "a", "b", "c"};

        // This will create one ebook in memory for each ebook in our library, but we don't use it all of them, so it would be a waste of memory.
//        for(var fileName : filenames){
//            library.add(new RealEbook(fileName));
//        }

        for(var fileName : filenames){
            library.add(new EbookProxy(fileName)); // Not creating a real ebook for each ebook in our library, only when necessary, that's why we use 'new EbookProxy()' instead of 'new RealEbook()'. ( Lazy loading ).
        }

        library.open("a");
    }

}
