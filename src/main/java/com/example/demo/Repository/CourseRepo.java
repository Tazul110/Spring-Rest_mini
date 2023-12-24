package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>
{

}
