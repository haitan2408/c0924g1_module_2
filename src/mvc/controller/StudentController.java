package mvc.controller;

import mvc.entity.Student;
import mvc.service.BeanFactory;
import mvc.service.IStudentService;
import mvc.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private final IStudentService studentService = (IStudentService) BeanFactory.getBean("student");
    public List<Student> display() {
        return studentService.getAll();
    }

    public void add(Student student) {
        studentService.save(student);
    }

    public Student findById(int id) {
        return studentService.findById(id);
    }

    public void remove(int id) {
        studentService.remove(id);
    }
}
