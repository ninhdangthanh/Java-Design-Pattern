package FactoryMethodPattern.Product;

public class FactoryMethodPatternMainApp {
    public static void main(String[] args) {
        ProductFactory factoryA = new ConcreteProductFactoryA();
        Product productA = factoryA.createProduct();
        productA.create();

        ProductFactory factoryB = new ConcreteProductFactoryB();
        Product productB = factoryB.createProduct();
        productB.create();
    }
}
