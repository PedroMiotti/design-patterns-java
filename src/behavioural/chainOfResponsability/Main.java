package chainOfResponsability;

public class Main {

    public static void main(String[] args){
        // Authenticator -> logger -> compressor
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));

        // You can easily rearrange the order or remove a step from the chain
        //  Compressor -> Authenticator
//        Compressor compressor2 = new Compressor(null);
//        Authenticator authenticator2 = new Authenticator(compressor2);


    }
}
