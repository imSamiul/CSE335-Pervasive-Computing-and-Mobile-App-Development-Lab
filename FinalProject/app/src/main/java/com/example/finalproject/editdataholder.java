package com.example.finalproject;

public class editdataholder {
    private String timefromdsc, timetodsc, busnumber;

    public editdataholder() {
    }

    public editdataholder(String timefromdsc, String timetodsc, String busnumber) {
        this.timefromdsc = timefromdsc;
        this.timetodsc = timetodsc;
        this.busnumber = busnumber;
    }

    public String getTimefromdsc() {
        return timefromdsc;
    }

    public void setTimefromdsc(String timefromdsc) {
        this.timefromdsc = timefromdsc;
    }

    public String getTimetodsc() {
        return timetodsc;
    }

    public void setTimetodsc(String timetodsc) {
        this.timetodsc = timetodsc;
    }

    public String getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(String busnumber) {
        this.busnumber = busnumber;
    }
}
