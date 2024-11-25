package mvc.repository;

import mvc.entity.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository {

    public List<Student> getAll() {
        File file = new File("src/mvc/data/data.csv");
        List<Student> students = new LinkedList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line = "";
            Student student = null;
            while ((line = bufferedReader.readLine())!= null) {
                String[] data = line.split(",");
                student = new Student(Integer.parseInt(data[0]), data[1], data[2], Float.parseFloat(data[3]));
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return students;
    }

    public void save(Student student) {
        File file = new File("src/mvc/data/data.csv");
//        try with resource
        try(FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            bufferedWriter.write(student.toString());
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi dữ liệu");
        }
//        students.add(student);
    }
}
