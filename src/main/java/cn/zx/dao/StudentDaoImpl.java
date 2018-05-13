package cn.zx.dao;

import cn.zx.beans.Student;
import cn.zx.utils.MyBaitsUtils;
import org.apache.ibatis.session.SqlSession;

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

    }
    public void deleteStudent(int id) {

    }

    public void updateStudent(Student student) {

    }

    public List<Student> selectAllStudents() {
        return null;
    }

    public Map<String, Object> selectAllStudentsMap() {
        return null;
    }

    public Student selectStudentById(int id) {
        return null;
    }

    public List<Student> selectStudentsByName(String name) {
        return null;
    }
}
