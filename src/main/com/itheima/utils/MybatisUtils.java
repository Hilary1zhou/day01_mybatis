package main.com.itheima.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MybatisUtils {

    //无参构造
    public MybatisUtils ( ) {
    }

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("MybatisConfig.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //提供静态方法,获取SqlSession对象
    public static SqlSession getSqlSession() {
       return sqlSessionFactory.openSession(true);
    }
}
