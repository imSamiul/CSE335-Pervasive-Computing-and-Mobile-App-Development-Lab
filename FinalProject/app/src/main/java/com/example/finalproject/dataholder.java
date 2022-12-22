package com.example.finalproject;

public class dataholder {
    private String busId, route, timefromdsc, timetodsc, busNo;

    public dataholder(String busId, String route, String timefromdsc, String timetodsc, String busNo) {
        this.busId = busId;
        this.route = route;
        this.timefromdsc = timefromdsc;
        this.timetodsc = timetodsc;
        this.busNo = busNo;
    }

    public String getBusId() {
        return busId;
    }

    public dataholder() {
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
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

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }
}
