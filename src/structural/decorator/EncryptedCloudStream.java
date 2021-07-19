package structural.decorator;

public class EncryptedCloudStream implements Stream{
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data){
        String dataEncrypted = encrypt(data);
        stream.write(dataEncrypted);
    }

    private String encrypt(String data){
        return "!@#$%#(**$(*";
    }

}
