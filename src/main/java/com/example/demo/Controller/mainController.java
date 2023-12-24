package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Course;
import com.example.demo.Model.Student;
import com.example.demo.Repository.CourseRepo;
import com.example.demo.Repository.StudentRepo;

@RestController
public class mainController {
   
	@Autowired
	 StudentRepo std;
	 
	@Autowired
	CourseRepo cr;
	
	
	@RequestMapping("/")
	public String hello()
	{
		return "Hello NEW coder";
	}
	
	@RequestMapping("/student/all")
	public List<Student>  GetstudentAll()
	{
		return std.findAll();
	}
	
	@RequestMapping("/student/{sid}")
	public Optional<Student>  Getstudent(@PathVariable int sid)
	{
		return std.findById(sid);
	}
	
	@RequestMapping("/course/all")
	public List<Course>  GetCourse()
	{
		return cr.findAll();
	}
	
	@RequestMapping("/student/add")
	public void  studentAdd(@RequestBody Student st)
	{
		std.save(st); 
	}
}
