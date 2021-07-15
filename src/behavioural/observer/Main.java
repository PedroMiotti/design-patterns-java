package observer;

public class Main {

    public static void main(String[] args){
        var dataSouce = new DataSource();
        var sheet1 = new SpreadSheet(dataSouce);
        var sheet2 = new SpreadSheet(dataSouce);
        var chart = new Chart(dataSouce);

        dataSouce.addObserver(sheet1);
        dataSouce.addObserver(sheet2);
        dataSouce.addObserver(chart);

        dataSouce.setValue(2);

    }
}
