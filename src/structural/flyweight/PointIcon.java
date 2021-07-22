package structural.flyweight;

public class PointIcon {
    private final PointType type; // 4 bytes

    private final byte[] icons; // 20 KB -> If our app has over a thousand points of interest its going to have 20 MB of icons alone.
    public PointIcon(PointType type, byte[] icons) {
        this.type = type;
        this.icons = icons;
    }

    public PointType getType() {
        return type;
    }

}
