package com.masteringspringfw.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses") // http://localhost:8080/courses
	public List<Course> retriveAllCourses() {
		return Arrays.asList(new Course(1, "Spring", "Ranga"), new Course(2, "Spring Boot", "Ranga"),
				new Course(3, "Maven 22", "Ranga"), new Course(4, "AWS", "Ranga"));
	}

}
