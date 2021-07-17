package main.com.itheima.service;

import main.com.itheima.bean.Student;

import java.util.List;

public interface StudentService {
    public abstract  List<Student> selectByIds(List<Integer> ids);

    public abstract List<Student> selectCondition(Student student);

    public abstract List<Student> selectByNameOrAge(String Name, Integer Age);
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
