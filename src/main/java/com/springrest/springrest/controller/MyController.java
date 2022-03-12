package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseSericeimpl;

@RestController
public class MyController {

	@Autowired
	private CourseSericeimpl courseService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to course APplication";
	}

	// get all Courses
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.courseService.getCourses();

	}

	//get particular course
	@GetMapping("/courses/{courseId}")
public Courses getCourse(@PathVariable String courseId ) {
	return this.courseService.getCourse(Long.parseLong(courseId));
	
}
	//add a new course
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		
		return this.courseService.addCourse(course);
	}
	
	//update the course
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course) {
		return this.courseService.updateCourse(course);
	}
}
