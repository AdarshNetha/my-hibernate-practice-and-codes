package onetoonebidierctional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Driver {
	@Id
	private int id;
	private String name;
	private int age;
	@OneToOne
	private Licence l;
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
	public Licence getL() {
		return l;
	}
	public void setL(Licence l) {
		this.l = l;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(int id, String name, int age, Licence l) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.l = l;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
