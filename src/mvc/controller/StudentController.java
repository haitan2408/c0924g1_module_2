package mvc.controller;

import mvc.entity.Student;
import mvc.service.IStudentService;
import mvc.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private IStudentService studentService = new StudentService();
    public List<Student> display() {
        return studentService.getAll();
    }

    public void add(Student student) {
        studentService.save(student);
    }
}
