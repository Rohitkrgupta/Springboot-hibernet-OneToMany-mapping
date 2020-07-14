package in.nit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="student_table")
public class Student {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private Gender gender;
	
	@OneToMany(targetEntity = Course.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "sc_fc",referencedColumnName = "id")
	private List<Course> courses;
	

}
