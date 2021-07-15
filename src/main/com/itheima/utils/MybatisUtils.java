package main.com.itheima.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MybatisUtils {

    //�޲ι���
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
    //�ṩ��̬����,��ȡSqlSession����
    public static SqlSession getSqlSession() {
       return sqlSessionFactory.openSession(true);
    }
}
