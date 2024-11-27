package ss12_thread;

public class Demo extends Thread{
    String name;
    public Demo() {
    }

    public Demo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i =0; i< 1000000; i++) {
            System.out.println(i +" "+ name);

        }
    }

    public static void main(String[] args) {
        Demo thread = new Demo("Nhat");
        Demo thread1 = new Demo("Thao");
        thread.start();
        thread1.start();

    }
}
