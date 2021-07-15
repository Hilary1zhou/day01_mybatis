package main.com.itheima.service.Impl;

import main.com.itheima.bean.Student;
import main.com.itheima.mapper.Impl.StudentMapperImpl;
import main.com.itheima.mapper.StudentMapper;
import main.com.itheima.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentMapper mapper = new StudentMapperImpl();

    @Override
    public List<Student> selectAll ( ) {
        return mapper.selectAll();
    }

    @Override
    public Student selectById (Integer id) {
        return mapper.selectById(id);
    }

    @Override
    public Integer insert (Student student) {
        return mapper.insert(student);
    }

    @Override
    public Integer update (Student student) {
        return mapper.update(student);
    }

    @Override
    public Integer delete (Integer id) {
        return mapper.delete(id);
    }

}
