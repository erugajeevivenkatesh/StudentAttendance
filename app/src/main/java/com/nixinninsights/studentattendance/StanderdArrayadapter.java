package com.nixinninsights.studentattendance;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by venkatesh on 14-03-2018.
 */

public class StanderdArrayadapter extends ArrayAdapter<Classes> {

    TextView mStanderdid;
    public StanderdArrayadapter(@NonNull Context context, int resource, @NonNull List<Classes> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitem=convertView;
        if(listitem==null){
            listitem= LayoutInflater.from(getContext()).inflate(R.layout.classinfo,parent,false);

        }
        Classes standerdd=getItem(position);
        String Standerd=standerdd.getStanderd();
        String Section=standerdd.getSection();

         mStanderdid=listitem.findViewById(R.id.standerds);
        mStanderdid.setText(Standerd);

        TextView msections=listitem.findViewById(R.id.section);
        msections.setText(Section);

        return listitem;
    }

}
