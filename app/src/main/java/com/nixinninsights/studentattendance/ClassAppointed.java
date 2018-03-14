package com.nixinninsights.studentattendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ClassAppointed extends AppCompatActivity {

    ArrayList<Classes> standeddetails=new ArrayList<Classes>();
    StanderdArrayadapter astad;
    ListView class_appointed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_appointed);
        class_appointed=findViewById(R.id.classapointed);
        addListdata();
        astad=new StanderdArrayadapter(this,0, standeddetails);
        class_appointed.setAdapter(astad);
        class_appointed.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getApplicationContext(),StudentAttendance.class));
            }
        });

    }

    public void addListdata()
    {
        Classes standerd=new Classes("I","A");
        standeddetails.add(standerd);
        standerd=new Classes("II","A");
        standeddetails.add(standerd);
        standerd=new Classes("III","A");
        standeddetails.add(standerd);
        standerd=new Classes("IV","A");
        standeddetails.add(standerd);
        standerd=new Classes("V","A");
        standeddetails.add(standerd);
    }


}
