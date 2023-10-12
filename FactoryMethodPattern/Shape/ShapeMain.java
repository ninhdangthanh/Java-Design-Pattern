package FactoryMethodPattern.Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();

        shape = ShapeFactory.getShape("square");
        shape.draw();

        shape = ShapeFactory.getShape("rectangle");
        shape.draw();
    }
}
