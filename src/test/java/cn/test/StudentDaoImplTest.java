package cn.test;

import cn.zx.beans.Student;
import cn.zx.dao.*;
import org.junit.Before;
import org.junit.Test;

public class StudentDaoImplTest {
    dao dao;

    @Before
    public void before(){
        dao = new StudentDaoImpl();
    }
    @Test
    public void insertStudent() {
        Student student = new Student("张与",96,5);
        dao.insertStudent(student);
    }

    @Test
    public void insertStudentCacheId() {
    }

    @Test
    public void deleteStudent() {
    }

    @Test
    public void updateStudent() {
    }

    @Test
    public void selectAllStudents() {
    }

    @Test
    public void selectAllStudentsMap() {
    }

    @Test
    public void selectStudentById() {
    }

    @Test
    public void selectStudentsByName() {
    }
}