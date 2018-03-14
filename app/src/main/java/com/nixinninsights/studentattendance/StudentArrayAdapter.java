package com.nixinninsights.studentattendance;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by venkatesh on 14-03-2018.
 */

public class StudentArrayAdapter extends ArrayAdapter<StudentDetails>{


    public StudentArrayAdapter(@NonNull Context context, int resource, @NonNull List<StudentDetails> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitem=convertView;
        if(listitem==null){
            listitem= LayoutInflater.from(getContext()).inflate(R.layout.studentinfo,parent,false);

        }
        StudentDetails st_details=getItem(position);


        String stu_name=st_details.getStudentname();
        String stu_rollNo=st_details.getStudentRollno();


        TextView Student_name=listitem.findViewById(R.id.student_name);
        Student_name.setText(stu_name);
        TextView Roll_no=listitem.findViewById(R.id.stu_rollno);
        Roll_no.setText(stu_rollNo);


        return listitem;
    }
}
