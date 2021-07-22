package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoint(){
        List<Point> points = new ArrayList<>();
        Point point = new Point(1, 2, iconFactory.getPointIcon(PointType.CAFE)); // We are not storing the pointIcon multiple time in memory, we are reusing from the factory.
        points.add(point);

        return points;

    }
}
