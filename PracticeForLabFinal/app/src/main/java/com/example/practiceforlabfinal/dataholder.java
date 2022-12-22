package com.example.practiceforlabfinal;

public class dataholder {
    String name, id,dept, residence;

    public dataholder() {
    }

    public dataholder(String name, String id, String dept, String residence) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.residence = residence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}

