package one_to_one_unidirectional_curd_oprtations;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private int age;
	@OneToOne(cascade = CascadeType.ALL)
	private Addar addar;
	public Person(int id, String name, int age, Addar addar) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.addar = addar;
	}
	public Person() {
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
	public Addar getAddar() {
		return addar;
	}
	public void setAddar(Addar addar) {
		this.addar = addar;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", addar=" + addar + "]";
	}

}
