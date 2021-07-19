package structural.decorator;

import java.util.*;

public class Main {

    public static void main(String[] args){
        // Decorating the cloudStream with a encryptedCloudStream
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));

        storeCreditCard(new CompressedCloudStream((new CloudStream())));

    }

    public static void storeCreditCard(Stream stream){
        stream.write("111-123-1234-232-2");
    }
}
