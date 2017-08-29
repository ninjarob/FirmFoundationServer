package com.koolkevans.firmfoundations.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/students/{studentId}/courses")
    public void retrieveCoursesForStudent(@PathVariable String studentId) {
        //return studentService.retrieveCourses(studentId);
    }

    @GetMapping("/students/{studentId}/courses/{courseId}")
    public void retrieveDetailsForCourse(@PathVariable String studentId,
                                           @PathVariable String courseId) {
        //return studentService.retrieveCourse(studentId, courseId);
    }

}
