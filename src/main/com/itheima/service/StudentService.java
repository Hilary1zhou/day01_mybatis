package main.com.itheima.service;

import main.com.itheima.bean.Student;

import java.util.List;

public interface StudentService {
    /**
     * ��ѯ����
     * @return
     */
    public abstract List<Student> selectAll ( );

    /**
     * ���ݲ�ѯ
     * @param id
     * @return
     */
    public abstract Student selectById (Integer id);

    /**
     * �����Ϣ
     * @param student
     * @return
     */
    public abstract Integer insert (Student student);

    /**
     * ɾ����Ϣ
     * @param id
     * @return
     */
    public abstract Integer delete (Integer id);

    /**
     * �޸���Ϣ
     * @param student
     * @return
     */
    public abstract Integer update (Student student);
}
