package mvc.service;

import mvc.service.impl.StudentService;
import mvc.service.impl.TeacherService;

public class BeanFactory {
    private BeanFactory(){

    }
    public static IService getBean(String name) {
        switch (name)  {
            case "student":
                return StudentService.getInstance();
            case "teacher":
                return new TeacherService();
            default:
                throw new RuntimeException("Bean không tồn tại");
        }
    }
}
