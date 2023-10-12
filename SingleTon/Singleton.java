package SingleTon;

public class Singleton {
    private static Singleton instance;
    
    // Private constructor để không thể tạo đối tượng từ bên ngoài
    private Singleton() { }

    // Phương thức để trả về instance duy nhất của lớp
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // Các phương thức khác của đối tượng Singleton
    public void doSomething() {
        System.out.println("Singleton is doing something");
    }
    
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.doSomething();
        
        Singleton singleton2 = Singleton.getInstance();
        singleton2.doSomething();
        
        // singleton1 và singleton2 cùng một đối tượng duy nhất
        System.out.println(singleton1 == singleton2); // Kết quả: true
    
    }
}
