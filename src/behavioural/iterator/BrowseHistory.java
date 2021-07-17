package behavioural.iterator;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int nextIndex = 0;

    public void push(String url) {
        urls[nextIndex] = url;
        nextIndex++;

        // urls.add(url); For List implementation

    }

    public String pop(){
        // List implementation
        // int lastIndex = urls.size() - 1;
        // String lastUrl = urls.get(lastIndex);
        // urls.remove(lastUrl);

        nextIndex--;


        return urls[nextIndex];
    }

    public Iterator createIterator(){
//        return new ListIterator(this);
        return new ArrayIterator(this);
    }

//    public class ListIterator implements Iterator<String>{
//
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history){
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            // Declaramos a classe ListIterator dentro do BrowseHistory
//            // para ter acesso ao campo privado urls e ter acesso aos metodos do List<>.
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }

    public class ArrayIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.nextIndex);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
