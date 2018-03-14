package com.nixinninsights.studentattendance;

/**
 * Created by venkatesh on 14-03-2018.
 */

public class Classes {
    public String Standerd,Section;
    public Classes(){

    }
    public Classes(String Standerd,String Section)
    {
        this.Section=Section;
        this.Standerd=Standerd;
    }


    public String getSection() {
        return Section;
    }

    public String getStanderd() {
        return Standerd;
    }

    public void setSection(String section) {
        Section = section;
    }

    public void setStanderd(String standerd) {
        Standerd = standerd;
    }
}
