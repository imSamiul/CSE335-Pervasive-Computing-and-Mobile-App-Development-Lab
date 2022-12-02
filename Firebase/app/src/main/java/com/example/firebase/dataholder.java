package com.example.firebase;

public class dataholder {
    String name, department, residence;

    public dataholder(String name, String department, String residence) {
        this.name = name;
        this.department = department;
        this.residence = residence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}
