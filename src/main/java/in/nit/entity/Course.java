package in.nit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Course {
	
	@Id
	private int cid;
	private String courseName;
	private int courseDuration;
	private Double coursePrice;

}
