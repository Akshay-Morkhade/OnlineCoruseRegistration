package com.OnlineCourseRegistration.exception;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(int id) {
        System.out.println("Course not found with id: " + id);
    }
}
