package com.OnlineCourseRegistration.controller;

import com.OnlineCourseRegistration.entity.Courses;
import com.OnlineCourseRegistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/save")
    public ResponseEntity<Courses> saveCourse(@RequestBody Courses courses) {
        return new ResponseEntity<>(courseService.registerCourse(courses), HttpStatus.CREATED);
    }

    @GetMapping("/view")
    public ResponseEntity<List<Courses>> viewCourses() {
        return new ResponseEntity<>(courseService.viewAllRegistrations(), HttpStatus.FOUND);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Courses> updateFees(@PathVariable int id, @RequestBody Courses courses) {
        return new ResponseEntity<>(courseService.updateFeesPaid(id, courses), HttpStatus.OK);
    }   

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        courseService.deleteById(id);
        return new ResponseEntity<>("successfully Deleted", HttpStatus.OK);
    }

}
