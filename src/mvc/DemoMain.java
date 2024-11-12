package mvc;

public class DemoMain {
    public static void main(String[] args) {
//        Nguyên lý D trong SOLID
        Person haitt = new Student(); // up casting
//        haitt = new Teacher();
//        Person[] people = new Person[20];
//        people[0] = new Student();
//        people[1] = new Teacher();

//        Down casting
        if(haitt instanceof Student) {
            System.out.println(((Student)haitt).getPoint());
        }



    }
}
