package many_to_many_bidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movie {
	@Id
	private int id;
	private String name;
	private int budject;
	@ManyToMany
	private List<Actor> al;
	public Movie(int id, String name, int budject, List<Actor> al) {
		super();
		this.id = id;
		this.name = name;
		this.budject = budject;
		this.al = al;
	}
	public Movie() {
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
	public int getBudject() {
		return budject;
	}
	public void setBudject(int budject) {
		this.budject = budject;
	}
	public List<Actor> getAl() {
		return al;
	}
	public void setAl(List<Actor> al) {
		this.al = al;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", budject=" + budject + "]";
	}
	
}
