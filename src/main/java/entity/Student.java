package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Student {
    @Id
    private String id;
    @Column
    private String full_name;
    @Column
    private Integer gender;
    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String dob;

    public Student() {
    }

    public Student(String full_name) {
        this.full_name = full_name;
    }

    public static String genId(String full_name) {
        String rs="";
        String[] str = full_name.split(" ");
        for(String name: str){
            char first = name.charAt(0);
            rs += first;
        }
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        rs += year;
        rs += month;
        rs += day;
        rs += hour;
        rs += minute;
        rs += second;
        return rs;
    }

    public String getId() {
        return id;
    }

    public void setId(String student_id) {
        this.id = student_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
