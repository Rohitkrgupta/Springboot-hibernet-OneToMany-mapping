package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nit.dto.OrderRequest;
import in.nit.dto.OrderResponse;
import in.nit.entity.Student;
import in.nit.repository.CourseRepository;
import in.nit.repository.StudentRepository;

@RestController
public class BuyCourseController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@PostMapping("/byeCourse")
	public Student buyCourse(@RequestBody OrderRequest request)
	{
		return studentRepository.save(request.getStudent());
	}
	
	@GetMapping("/findAllCourses")
	public List<Student> findAllCourses()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("/getStudentCourseInfo")
	public List<OrderResponse> findAllStudentAndThereCourses()
	{
		return studentRepository.getAllStudentAndTheirCourses();
	}
}
