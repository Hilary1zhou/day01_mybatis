package main.com.itheima.mapper;

import main.com.itheima.bean.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * ��ѯ����
     * @return
     */
    public abstract List<Student> selectAll();

    /**
     * ����id��ѯ
     * @param id
     * @return
     */
    public abstract Student selectById(Integer id);

    /**
     * ����ѧ����Ϣ
     * @param stu
     * @return
     */
    public abstract Integer insert(Student stu);

    /**
     * �޸�ѧ����Ϣ
     * @param stu
     * @return
     */
    public abstract Integer update(Student stu);

    /**
     * ɾ��ѧ����Ϣ
     * @param id
     * @return
     */
    public abstract Integer delete(Integer id);
}
