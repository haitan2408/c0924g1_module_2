package mvc.entity;

public abstract class Person implements Comparable<Student> {
    private int code;
    private String name;
    private String address;

    public Person() {
    }

    public Person(int code, String name, String address) {
        this.code = code;
        this.name = name;
        this.address = address;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return this.code + "," + this.name + "," + this.address;
    }

    @Override
    public int compareTo(Student o) {
        return this.getCode() - o.getCode();
    }
}
