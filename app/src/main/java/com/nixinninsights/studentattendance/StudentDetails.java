package com.nixinninsights.studentattendance;

/**
 * Created by venkatesh on 14-03-2018.
 */

public class StudentDetails {
    public  String studentname,StudentRollno;

    public StudentDetails()
    {


    }
    public  StudentDetails(String studentname,String StudentRollno)
    {
        this.studentname=studentname;
        this.StudentRollno=StudentRollno;
    }

    public String getStudentname() {
        return studentname;
    }

    public String getStudentRollno() {
        return StudentRollno;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setStudentRollno(String studentRollno) {
        StudentRollno = studentRollno;
    }
}
