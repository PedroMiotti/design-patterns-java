package structural.flyweight;

public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
    private PointIcon icon; // With this structure we can store each icon in a single place and reference it in multiple points, we are not storing the same array of bytes in multiple places in memory.

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }


    public void draw(){
        System.out.printf("%s at (%d, %d)", icon.getType(), x, y);
    }
}
