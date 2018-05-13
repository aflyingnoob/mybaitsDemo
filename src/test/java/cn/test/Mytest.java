package cn.test;

import cn.zx.beans.Student;
import cn.zx.dao.StudentDaoImpl;
import cn.zx.dao.dao;
import org.junit.Before;
import org.junit.Test;

public class Mytest {
    dao dao;

    @Before
    public void before(){
        dao = new StudentDaoImpl();
    }
    @Test
    public void testInsert(){


        Student student = new Student("张与",93,5);
        dao.insertStudent(student);


    }


}
