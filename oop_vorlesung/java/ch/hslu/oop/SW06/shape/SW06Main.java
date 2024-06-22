package ch.hslu.oop.SW06.shape;

public class SW06Main {
    
    public static void main(String[] args) {
        ShapeV2 shape1 = new CircleV2(5, 5, 10);
        shape1.move(10,10);
        int x1 = shape1.getX();
        int y1 = shape1.getY();
        System.out.println((x1 + y1));
        int diameter = ((CircleV2) shape1).getDiameter();
        System.out.println(diameter);

        ShapeV2 shape2 = new RectangleV2(5, 5, 15, 20);
        shape2.move(10, 10);
        int x2 = shape2.getX();
        int y2 = shape2.getY();
        System.out.println(x2 + y2);
    }
}