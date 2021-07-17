package main.com.itheima.service.Impl;

import main.com.itheima.bean.Student;
import main.com.itheima.mapper.StudentMapper;
import main.com.itheima.service.StudentService;
import main.com.itheima.utils.MybatisUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> selectByIds(List<Integer> ids) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.selectByIds(ids);
        sqlSession.close();
        return list;
    }

    @Override
    public List<Student> selectCondition(Student student) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.selectCondition(student);
        sqlSession.close();
        return list;
    }

    @Override
    public List<Student> selectByNameOrAge(String Name, Integer Age) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.selectByNameOrAge(Name, Age);
        sqlSession.close();
        return list;
    }

    @Override
    public List<Student> selectAll ( ) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.selectAll();
        sqlSession.close();
        return list;
    }

    @Override
    public Student selectById (Integer id) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectById(id);
        sqlSession.close();
        return student;
    }

    @Override
    public Integer insert (Student student) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Integer result = mapper.insert(student);
        sqlSession.close();
        return result;
    }

    @Override
    public Integer update (Student student) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Integer result = mapper.update(student);
        sqlSession.close();
        return result;
    }

    @Override
    public Integer delete (Integer id) {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取StudentMapper接口的实现类对象
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //通过实现类对象调用方法，接收结果
        Integer result = mapper.delete(id);
        //释放资源
        sqlSession.close();
        //返回结果
        return result;
    }

}
