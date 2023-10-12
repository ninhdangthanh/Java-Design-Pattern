package FactoryMethodPattern.Product;

class ConcreteProductFactoryA implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}