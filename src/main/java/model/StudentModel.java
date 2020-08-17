package model;

import entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    private final Connection connection = new conn().getConnection();

    public boolean create(String full_name, String id, Integer gender, String address, String phone, String email, String dob) throws SQLException {
        String sql = "INSERT INTO student (full_name, id, gender, address, phone, email, dob) VALUES ('" + full_name + "', '" + id + "'," + gender + ",'" + address+ "', '" + phone + "', '" + email +"', '" +dob +"')";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }

    public List<Student> getAll() throws SQLException {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String full_name = resultSet.getString("full_name");
            int gender = resultSet.getInt("gender");
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            String email = resultSet.getString("email");
            String dob = resultSet.getString("dob");
            Student student = new Student(full_name);
            student.setId(id);
            student.setGender(gender);
            student.setAddress(address);
            student.setPhone(phone);
            student.setEmail(email);
            student.setDob(dob);
            list.add(student);
        }
        return list;
    }

    public Student getById(String id) throws SQLException {
        Student list = new Student();
        String sql = "SELECT * FROM student WHERE id = '" + id + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String s_id = resultSet.getString("id");
            String full_name = resultSet.getString("full_name");
            int gender = resultSet.getInt("gender");
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            String email = resultSet.getString("email");
            String dob = resultSet.getString("dob");
            Student student = new Student(full_name);
            student.setId(s_id);
            student.setGender(gender);
            student.setAddress(address);
            student.setPhone(phone);
            student.setEmail(email);
            student.setDob(dob);
            return student;
        }

    }

    public boolean update(String full_name, String id, Integer gender, String address, String phone, String email, String dob) throws SQLException {
        String sql = "UPDATE student SET full_name = '" + full_name + "', gender = " + gender + ", address = '" + address + "', phone = '" + phone + "', dob = '" + dob +"', email = '" + email + "' WHERE id = '" + id + "'";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }

    public boolean delete(String id) throws SQLException {
        String sql = "DELETE FROM student WHERE id = '" + id + "'";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }
}
