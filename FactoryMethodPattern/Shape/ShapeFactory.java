package FactoryMethodPattern.Shape;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType.equals("circle")) {
            return new Circle();
        } else if (shapeType.equals("square")) {
            return new Square();
        } else if (shapeType.equals("rectangle")) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
