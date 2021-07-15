package main.com.itheima.mapper;

import main.com.itheima.bean.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * 查询所有
     * @return
     */
    public abstract List<Student> selectAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public abstract Student selectById(Integer id);

    /**
     * 新增学生信息
     * @param stu
     * @return
     */
    public abstract Integer insert(Student stu);

    /**
     * 修改学生信息
     * @param stu
     * @return
     */
    public abstract Integer update(Student stu);

    /**
     * 删除学生信息
     * @param id
     * @return
     */
    public abstract Integer delete(Integer id);
}
