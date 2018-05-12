package com.hwa.mybatis.model;

/**
 * 学生信息实体
 * @author LiuHua
 * @date 2018/5/10
 */
public class Student {

    //ID
    private int studentId;
    //姓名
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
