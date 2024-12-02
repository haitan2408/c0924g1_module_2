package mvc.service.impl;

import mvc.entity.Teacher;
import mvc.service.ITeacherService;

import java.util.List;

public class TeacherService implements ITeacherService {
    @Override
    public List<Teacher> getAll() {
        return List.of();
    }

    @Override
    public void save(Teacher s) {

    }

    @Override
    public Teacher findById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Teacher> findByNam(String name) {
        return List.of();
    }
}
