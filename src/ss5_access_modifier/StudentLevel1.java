package ss5_access_modifier;

import ss4.Student;

public class StudentLevel1 extends Student {
    private boolean isBanTru;

    public static void main(String[] args) {
        StudentLevel1 studentLevel1 = new StudentLevel1();
        Student student = new Student();
//        student.code = 2;
        studentLevel1.code = 1;
    }

    public  class Demo {

    }
}
