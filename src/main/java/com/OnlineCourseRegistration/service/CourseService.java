package com.OnlineCourseRegistration.service;

import com.OnlineCourseRegistration.entity.Courses;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface CourseService {
    Courses registerCourse(Courses courses);

    List<Courses> viewAllRegistrations();

    Courses updateFeesPaid(int id, Courses courses);

    void deleteById(int id);

}
