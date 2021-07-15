package main.com.itheima.mapper.Impl;

import main.com.itheima.bean.Student;
import main.com.itheima.mapper.StudentMapper;
import main.com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentMapperImpl implements StudentMapper {

    @Override
    public List<Student> selectAll ( ) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<Student> list = sqlSession.selectList("StudentMapper.selectAll");
        sqlSession.close();
        return list;
    }

    @Override
    public Student selectById (Integer id) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Student student = sqlSession.selectOne("StudentMapper.selectById",id);
        sqlSession.close();
        return student;
    }

    @Override
    public Integer insert (Student stu) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Integer result = sqlSession.insert("StudentMapper.insert", stu);
        sqlSession.close();
        return result;
    }

    @Override
    public Integer update (Student stu) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Integer result = sqlSession.insert("StudentMapper.update", stu);
        sqlSession.close();
        return result;
    }

    @Override
    public Integer delete (Integer id) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Integer result = sqlSession.insert("StudentMapper.delete", id);
        sqlSession.close();
        return result;

    }
}
