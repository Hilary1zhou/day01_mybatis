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
     * ��ѯ����
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
     * ����id��ѯ
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
        Student student = new Student(4, "����", 26);
        int result = sqlSession.insert("StudentMapper.insert", student);
        System.out.println(result);
        sqlSession.close();
        is.close();
    }

    @Test
    public void update ( ) throws Exception {
        //1.���غ��������ļ�
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");
        //2.��ȡsql��������
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.��ȡsqlSession����
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.ִ��sql���ؽ��
        Student student = new Student(4, "����", 38);
        int result = sqlSession.insert("StudentMapper.update", student);
        //5.��������
        sqlSession.commit();
        System.out.println(result);
        //6.������Դ
        sqlSession.close();
        is.close();
    }

    @Test
    public void delete ( ) throws Exception {
        //1.���غ��������ļ�
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");
        //2.��ȡsql��������
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.��ȡsqlSession����
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.ִ��sql���ؽ��
        int result = sqlSession.delete("StudentMapper.delete", 4);
        //5.��������
        sqlSession.commit();
        System.out.println(result);
        //6.������Դ
        sqlSession.close();
        is.close();
    }
}
