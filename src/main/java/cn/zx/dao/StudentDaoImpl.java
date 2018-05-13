package cn.zx.dao;

import cn.zx.beans.Student;
import cn.zx.utils.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements dao {
    SqlSession sqlSession;



    public void insertStudent(Student student) {
        try {
            sqlSession = MyBaitsUtils .getSqlSession();
            sqlSession.insert("insertStudent",student);
            sqlSession.commit();

        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    public void insertStudentCacheId(Student student) {
        try {
            sqlSession = MyBaitsUtils .getSqlSession();
            sqlSession.insert("insertStudentCacheId",student);
            sqlSession.commit();

        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }

    }
    public void deleteStudent(int id) {
        try {
            sqlSession = MyBaitsUtils .getSqlSession();
            sqlSession.insert("deleteStudent",id);
            sqlSession.commit();

        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    public void updateStudent(Student student) {
        try {
            sqlSession = MyBaitsUtils .getSqlSession();
            sqlSession.update("updateStudent",student);


        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }

    }

    public List<Student> selectAllStudents() {
        List<Student> students = null;
        try {
            sqlSession = MyBaitsUtils .getSqlSession();
            students = sqlSession.selectList("selectAllStudents");
            sqlSession.commit();

        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return students;
    }

    public Map<String, Object> selectAllStudentsMap() {

        Map<String, Object> map = new HashMap<String, Object>();
        try {
            sqlSession = MyBaitsUtils .getSqlSession();
            map = sqlSession.selectMap("selectAllStudents","name");
            sqlSession.commit();

        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return map;
    }

    public Student selectStudentById(int id) {
        Student student = null;
        try {
            sqlSession = MyBaitsUtils .getSqlSession();
            student = sqlSession.selectOne("selectStudentById",id);
            sqlSession.commit();

        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return student;
    }

    public List<Student> selectStudentsByName(String name) {

        List<Student> students = null;
        try {
            sqlSession = MyBaitsUtils .getSqlSession();
            students = sqlSession.selectList("selectStudentsByName",name);
            sqlSession.commit();

        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return students;
    }
}
