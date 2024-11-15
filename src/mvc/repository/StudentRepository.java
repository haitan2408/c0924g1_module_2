package mvc.repository;

import mvc.entity.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository {
    private static List<Student> students = new LinkedList<>();

    public List<Student> getAll() {
        return students;
    }

    public void save(Student student) {
        students.add(student);
    }
}
