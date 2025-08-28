package com.dikshant.Spring_JDBC.repository;


import com.dikshant.Spring_JDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {


    private JdbcTemplate temp;

    public JdbcTemplate getTemp() {
        return temp;
    }

    @Autowired
    public void setTemp(JdbcTemplate temp) {
        this.temp = temp;
    }

    public void save(Student s) {

        String sql = "insert into student (rollno, name, marks) values(?,?,?)";
        int rows = temp.update(sql,s.getRollNo(),s.getName(),s.getMarks());

        System.out.println(rows+" effected");

    }

    public List<Student> findAll() {
        List<Student> lt = new ArrayList<>();
        String sql = "select * from student";
//
//        RowMapper<Student> mapper = (rs, rowNum) -> {
//
//                Student stu = new Student();
//
//                stu.setRollNo(rs.getInt("rollno"));
//                stu.setName(rs.getString("name"));
//                stu.setMarks(rs.getInt("marks"));
//
//                return stu;
//        };

        return temp.query(sql, (rs, rowNum) -> {
            Student stu = new Student();
            stu.setRollNo(rs.getInt("rollno"));
            stu.setName(rs.getString("name"));
            stu.setMarks(rs.getInt("marks"));
            return stu;
        });
    }
}
