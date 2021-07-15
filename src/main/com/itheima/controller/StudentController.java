package main.com.itheima.controller;

import main.com.itheima.bean.Student;
import main.com.itheima.service.Impl.StudentServiceImpl;
import main.com.itheima.service.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StudentController {
    private StudentService service = new StudentServiceImpl();
    @Test
    public void test ( ) {
        List<Student> students = service.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("---------------");
        Student student1 = service.selectById(3);
        System.out.println(student1);

    }
}
