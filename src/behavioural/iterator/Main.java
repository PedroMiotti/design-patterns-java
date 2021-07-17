package behavioural.iterator;

public class Main {

    public static void main(String[] args){
        var history = new BrowseHistory();

        history.push("a");
        history.push("b");
        history.push("c");


        // This implementation will not change if we change the structure method inside BrowseHistory
        // For example we decide to change from List to Array
        Iterator iterator = history.createIterator();
        while( iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

    }

}
