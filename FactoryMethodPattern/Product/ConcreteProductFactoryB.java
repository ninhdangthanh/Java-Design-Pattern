package FactoryMethodPattern.Product;

class ConcreteProductFactoryB implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}