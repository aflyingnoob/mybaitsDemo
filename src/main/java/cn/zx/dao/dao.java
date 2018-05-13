package cn.zx.dao;

import cn.zx.beans.Student;

import java.util.List;
import java.util.Map;

public interface dao {


    void insertStudent(Student student);
    void insertStudentCacheId(Student student);

    void deleteStudent(int id);
    void updateStudent(Student student);

    List<Student> selectAllStudents();
    Map<String,Object> selectAllStudentsMap();
    Student selectStudentById(int id);
    List<Student> selectStudentsByName(String name);
}
