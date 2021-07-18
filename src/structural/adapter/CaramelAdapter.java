package structural.adapter;

import structural.adapter.avaFilter.Caramel;

// 2 option: Using inheritance ( Not very flexible, because java doesn't have multiple inheritance )
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
