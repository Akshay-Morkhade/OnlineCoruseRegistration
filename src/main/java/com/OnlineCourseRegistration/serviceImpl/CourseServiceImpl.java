package com.OnlineCourseRegistration.serviceImpl;

import com.OnlineCourseRegistration.entity.Courses;
import com.OnlineCourseRegistration.exception.CourseNotFoundException;
import com.OnlineCourseRegistration.repository.CourseRepository;
import com.OnlineCourseRegistration.service.CourseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Override
    public Courses registerCourse(Courses courses) {
        return courseRepository.save(courses);
    }

    @Override
    public List<Courses> viewAllRegistrations() {
        return courseRepository.findAll();
    }

    @Override
    public Courses updateFeesPaid(int id, Courses courses) {
        Courses c = courseRepository.findById(id).orElseThrow(() -> new CourseNotFoundException(id));
        c.setFeesPaid(courses.getFeesPaid());
        return courseRepository.save(c);
    }

    @Override
    public void deleteById(int id) {
        if (!courseRepository.existsById(id)) {
            throw new CourseNotFoundException(id);
        }
        courseRepository.deleteById(id);
    }
}
