package many_to_many_bidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {
	@Id
	private int id;
	private String name;
	private int age;
	private List<Movie> ml;
	
		
}
