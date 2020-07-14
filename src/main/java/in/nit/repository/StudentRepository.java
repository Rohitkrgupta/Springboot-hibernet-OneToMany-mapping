package in.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nit.dto.OrderResponse;
import in.nit.entity.Student;

public interface StudentRepository  extends JpaRepository<Student,Integer>{

	@Query("SELECT new in.nit.dto.OrderResponse(s.name,c.courseName) FROM student_table s JOIN s.course c ")
	public List<OrderResponse> getAllStudentAndTheirCourses();
}
