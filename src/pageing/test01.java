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
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MyBatisConfig.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(is);
        //3.通过工厂对象获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //4.获取StudentMapper接口的实现类对象
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //通过分页助手来实现分页功能
        // 第一页：显示3条数据
        //PageHelper.startPage(1,3);
        // 第二页：显示3条数据
        //3.分页插件相关参数
        //PageInfo：封装分页相关参数的功能类。
        //核心方法PageHelper.startPage(2,3);

        // 第三页：显示3条数据
        PageHelper.startPage(3, 3);
        //5.调用实现类的方法，接收结果
        List<Student> list = mapper.selectAll();
        //6.处理结果
        for (Student student : list) {
            System.out.println(student);
        }
        //7.释放资源
        sqlSession.close();
        is.close();
    }
}
