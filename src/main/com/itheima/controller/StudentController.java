package main.com.itheima.controller;

import main.com.itheima.bean.Student;
import main.com.itheima.service.Impl.StudentServiceImpl;
import main.com.itheima.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private StudentService service = new StudentServiceImpl();
    @Test
    public void selectByIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        List<Student> list = service.selectByIds(arrayList);
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    public void selectCondition() {
        Student student = new Student(null,null,null);
        List<Student> list = service.selectCondition(student);
        for (Student s1 : list) {
            System.out.println(s1);
        }
    }

    //根据姓名或年龄查询功能测试
    @Test
    public void selectByNameOrAge ( ) {
        List<Student> students = service.selectByNameOrAge("张三",24);
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
   //查询所有
    public void test1 ( ) {
        List<Student> students = service.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void test2() {
        Student student = service.selectById(4);
        System.out.println(student);
    }
    @Test
    public void test3() {
        Student stu = new Student(8,"螳螂",30);
        Integer result = service.insert(stu);
        System.out.println(result);
    }
    @Test
    public void test4() {
        Student stu = new Student(5,"德莱文",20);
        Integer result = service.update(stu);
        System.out.println(result);
    }
    @Test
    public void test5() {
        Integer result = service.delete(4);
        System.out.println(result);
    }
}
