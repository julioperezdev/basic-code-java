package com.company.model;

public class Student {

    private String nameStudent;
    private int ageStudent;

    public Student(String nameStudent, int ageStudent) {
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }
}
