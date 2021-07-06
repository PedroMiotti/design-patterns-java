package observer;

public class SpreadSheet implements Observer{
    private DataSource dataSource; // Using the pull style of communication (Coupling)

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet update : " + dataSource.getValue());
    }
}
