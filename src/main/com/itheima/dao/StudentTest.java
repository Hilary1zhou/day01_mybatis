package main.com.itheima.dao;

import main.com.itheima.bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;


import java.io.InputStream;
import java.util.List;


public class StudentTest {

    /**
     * 查询所有
     *
     * @throws Exception
     */
    @Test
    public void selectAll ( ) throws Exception {
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Student> list = sqlSession.selectList("StudentMapper.selectAll");
        for (Student student : list) {
            System.out.println(student);
        }
        sqlSession.close();
        is.close();
    }

    /**
     * 根据id查询
     *
     * @throws Exception
     */
    @Test
    public void selectById ( ) throws Exception {
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Student stu = sqlSession.selectOne("StudentMapper.selectById", 3);
        System.out.println(stu);
        sqlSession.close();
        is.close();
    }

    @Test
    public void insert ( ) throws Exception {
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        Student student = new Student(4, "赵六", 26);
        int result = sqlSession.insert("StudentMapper.insert", student);
        System.out.println(result);
        sqlSession.close();
        is.close();
    }

    @Test
    public void update ( ) throws Exception {
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");
        //2.获取sql工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行sql返回结果
        Student student = new Student(4, "周七", 38);
        int result = sqlSession.insert("StudentMapper.update", student);
        //5.处理事务
        sqlSession.commit();
        System.out.println(result);
        //6.销毁资源
        sqlSession.close();
        is.close();
    }

    @Test
    public void delete ( ) throws Exception {
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");
        //2.获取sql工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行sql返回结果
        int result = sqlSession.delete("StudentMapper.delete", 4);
        //5.处理事务
        sqlSession.commit();
        System.out.println(result);
        //6.销毁资源
        sqlSession.close();
        is.close();
    }
}
