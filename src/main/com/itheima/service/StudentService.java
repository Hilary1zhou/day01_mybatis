package main.com.itheima.service;

import main.com.itheima.bean.Student;

import java.util.List;

public interface StudentService {
    public abstract  List<Student> selectByIds(List<Integer> ids);

    public abstract List<Student> selectCondition(Student student);

    public abstract List<Student> selectByNameOrAge(String Name, Integer Age);
    /**
     * 查询所有
     * @return
     */
    public abstract List<Student> selectAll ( );

    /**
     * 根据查询
     * @param id
     * @return
     */
    public abstract Student selectById (Integer id);

    /**
     * 添加信息
     * @param student
     * @return
     */
    public abstract Integer insert (Student student);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public abstract Integer delete (Integer id);

    /**
     * 修改信息
     * @param student
     * @return
     */
    public abstract Integer update (Student student);
}
