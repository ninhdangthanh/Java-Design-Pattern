package FactoryMethodPattern.Product;

//Các lớp cụ thể triển khai giao diện Product
class ConcreteProductA implements Product {
 @Override
 public void create() {
     System.out.println("Product A created");
 }
}