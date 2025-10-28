package many_to_many_bidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actor {
	@Id
	private int id;
	private String name;
	private int age;
	@ManyToMany
	private List<Movie> ml;
	public Actor(int id, String name, int age, List<Movie> ml) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.ml = ml;
	}
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Movie> getMl() {
		return ml;
	}
	public void setMl(List<Movie> ml) {
		this.ml = ml;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
		
}
