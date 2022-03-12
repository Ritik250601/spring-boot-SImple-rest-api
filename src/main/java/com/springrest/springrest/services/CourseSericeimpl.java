package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.entities.Courses;

@Service
public class CourseSericeimpl implements CourseService {

//	List<Courses> list;
	@Autowired
	private CourseDao courseDao;
	
	
public CourseSericeimpl() {
		
//		list = new ArrayList();
//		list.add(new Courses(145, "Java Core", "this cousrse basic o fjava"));
//		list.add(new Courses(155, "spring boot 1", "this cousrse basic o fjava"));
		
		
	}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Courses getCourse(long courseId) {
//		Courses c = null;
			
//			c = (Courses) list.stream().filter(e -> e.getId() == courseId);
		
		

		return courseDao.getOne(courseId);
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		boolean f = false;
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//				
//			}
			
//		});
		courseDao.save(course);
		
		return course;
	}
	
	
	
	

}
