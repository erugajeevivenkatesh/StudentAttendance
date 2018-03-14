package com.nixinninsights.studentattendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class StudentAttendance extends AppCompatActivity {

    ListView students;
    List<StudentDetails> stu_info=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_attendance);
        students=findViewById(R.id.attendanceinfo);
        addstudentinfo();
        StudentArrayAdapter adapeter=new StudentArrayAdapter(this,0,stu_info);
        students.setAdapter(adapeter);


    }
    public void addstudentinfo()
    {
        StudentDetails set=new StudentDetails("Venkatesh","13byu82");
        stu_info.add(set);
        set=new StudentDetails("Kime","13b82");
        stu_info.add(set);
        set=new StudentDetails("vas","b");
        stu_info.add(set);
        set=new StudentDetails("imfo","jh");
        stu_info.add(set);
        set=new StudentDetails("Vdksd","13hjbb82");
        stu_info.add(set);
        set=new StudentDetails("dskk","13bbh82");
        stu_info.add(set);
        set=new StudentDetails("hindks","13bhbhv82");
        stu_info.add(set);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuitem, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.studentadd) {

            startActivity(new Intent(this,RegisterStudent.class));
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
