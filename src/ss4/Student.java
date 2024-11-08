package ss4;

public class Student {
    protected int code;
    String name;
    String address;
    float point;

    public Student(String address) {
        this.address = address;
        System.out.println("hi");
    }
    public Student() {
        this("Vịet Nam");
        System.out.println("hello");

    }



    public void example() {
        System.out.println("Thi cử");
    }
}
