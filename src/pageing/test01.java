package pageing;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import main.com.itheima.bean.Student;
import main.com.itheima.mapper.StudentMapper;
import main.com.itheima.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class test01 {
    @Test
    public void selectPage() throws Exception {
        //1.���غ��������ļ�
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");
        //2.��ȡSqlSession��������
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(is);
        //3.ͨ�����������ȡSqlSession����
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //4.��ȡStudentMapper�ӿڵ�ʵ�������
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //ͨ����ҳ������ʵ�ַ�ҳ����
        // ��һҳ����ʾ3������
        //PageHelper.startPage(1,3);
        // �ڶ�ҳ����ʾ3������
        //3.��ҳ�����ز���
        //PageInfo����װ��ҳ��ز����Ĺ����ࡣ
        //���ķ���PageHelper.startPage(2,3);

        // ����ҳ����ʾ3������
        PageHelper.startPage(3, 3);
        //5.����ʵ����ķ��������ս��
        List<Student> list = mapper.selectAll();
        //6.������
        for (Student student : list) {
            System.out.println(student);
        }
        //7.�ͷ���Դ
        sqlSession.close();
        is.close();
    }
}
