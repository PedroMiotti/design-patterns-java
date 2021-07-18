package structural.adapter;

import structural.adapter.avaFilter.Caramel;

public class Main {

    public static void main(String[] args){
        ImageView imgView = new ImageView(new Image());
        imgView.apply(new CaramelFilter(new Caramel()));
    }
}
