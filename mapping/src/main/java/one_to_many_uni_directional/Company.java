package one_to_many_uni_directional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Worker> wlist;
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
	public List<Worker> getWlist() {
		return wlist;
	}
	public void setWlist(List<Worker> wlist) {
		this.wlist = wlist;
	}
	public Company(int id, String name, List<Worker> wlist) {
		super();
		this.id = id;
		this.name = name;
		this.wlist = wlist;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", wlist=" + wlist + "]";
	}
	
	
}
