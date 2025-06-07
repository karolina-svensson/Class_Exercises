package org.example;

public class Student {
    private String name;
    private int studentID;
    private double grade;

    public Student(String name, int studentID, double grade) {
        this.name = name;
        this.studentID = studentID;
        if (grade < 0.0 || grade > 4.0) {
            throw new IllegalArgumentException("Grade must be between 0.0 and 4.0");
        }
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0.0 || grade > 4.0) {
            throw new IllegalArgumentException("Grade must be between 0.0 and 4.0");
        }
        this.grade = grade;
    }
    public void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);
    }
}
