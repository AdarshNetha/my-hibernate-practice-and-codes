package many_to_many_bidirectional;

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
	private Movie m;
	public Actor(int id, String name, int age, Movie m) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.m = m;
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
	public Movie getM() {
		return m;
	}
	public void setM(Movie m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
