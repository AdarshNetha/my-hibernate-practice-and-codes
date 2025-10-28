package many_to_many_bidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Doctor {
	@Id
	private int id;
	private String name;
	private String specialist;
	@ManyToMany
	private List<Patient> plist;
	public Doctor(int id, String name, String specialist, List<Patient> plist) {
		super();
		this.id = id;
		this.name = name;
		this.specialist = specialist;
		this.plist = plist;
	}
	public Doctor() {
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
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public List<Patient> getPlist() {
		return plist;
	}
	public void setPlist(List<Patient> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialist=" + specialist + "]";
	}
	
}
