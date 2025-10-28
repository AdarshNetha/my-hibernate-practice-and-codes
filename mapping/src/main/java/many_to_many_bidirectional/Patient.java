package many_to_many_bidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {
	@Id
	private int id;
	private String name;
	private String diesease;
	@ManyToMany
	private List<Doctor> dlist;
	public Patient(int id, String name, String diesease, List<Doctor> dlist) {
		super();
		this.id = id;
		this.name = name;
		this.diesease = diesease;
		this.dlist = dlist;
	}
	public Patient() {
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
	public String getDiesease() {
		return diesease;
	}
	public void setDiesease(String diesease) {
		this.diesease = diesease;
	}
	public List<Doctor> getDlist() {
		return dlist;
	}
	public void setDlist(List<Doctor> dlist) {
		this.dlist = dlist;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", diesease=" + diesease + "]";
	}
	
}
