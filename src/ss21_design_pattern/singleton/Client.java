package ss21_design_pattern.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        Service.test();
    }
}
