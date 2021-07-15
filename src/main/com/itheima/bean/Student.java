package main.com.itheima.bean;

public class Student {
    private Integer id;
    private String Name;
    private Integer Age;

    public Student (Integer id, String name, Integer age) {
        this.id = id;
        Name = name;
        Age = age;
    }

    public Student ( ) {
    }

    public Integer getId ( ) {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }


    public String getName ( ) {
        return Name;
    }

    public void setName (String name) {
        Name = name;
    }

    public Integer getAge ( ) {
        return Age;
    }

    public void setAge (Integer age) {
        Age = age;
    }

    @Override
    public String toString ( ) {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
