package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.entity.Course;

public interface CourseRepository  extends JpaRepository<Course,Integer>{

}
