package main.com.itheima.mapper;

import main.com.itheima.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    public abstract List<Student> selectByIds(List<Integer> ids);
    /**
     *
     * @param student
     * @return
     */
    public abstract List<Student> selectCondition(Student student);

    /**
     * ���������������ѯ
     * @param Name
     * @param Age
     * @return
     */
    public abstract List<Student> selectByNameOrAge(@Param("p1") String Name, @Param("p2") Integer Age);
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
