package com.OnlineCourseRegistration.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.time.LocalDate;

@Entity
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Student name is required")
    private String studentName;

    @NotBlank(message = "Course Name is required")
    private String courseName;

    @NotNull(message = "Registration Date is Required")
    private LocalDate registrationDate;

    @PositiveOrZero(message = "Fees cannot be Negative")
    private double feesPaid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }
}
