package com.pluralsight;

public class Students {
    // Variables
    private String name;
    private int StudentId;
    private double gpa;
    private boolean isEnrolled;

    // Constructor
    public Students(String name, int studentId, double gpa, boolean isEnrolled) {
        this.name = name;
        StudentId = studentId;
        this.gpa = 0.0;
        this.isEnrolled = false;
    }


    // name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // student id getter and setter
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    // gpa getter and setter
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // is enrolled getter and setter
    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }

    // Method
    public String profile(){
        return "name: " + name + "\nstudentId: " + getStudentId() + "\nGpa: " + gpa + "\nIs enrolled: "+ isEnrolled;

    }



}
