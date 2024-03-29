package structural.composite;

public class Main {

    public static void main(String[] args){
        Group group1 = new Group();

        group1.add(new Shape()); // Square
        group1.add(new Shape()); // Square

        Group group2 = new Group();

        group2.add(new Shape()); // Circle
        group2.add(new Shape()); // Circle

        Group group = new Group();

        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
    }
}
