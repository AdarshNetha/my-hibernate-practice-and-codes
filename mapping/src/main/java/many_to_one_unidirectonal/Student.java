package many_to_one_unidirectonal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String sname;
	private double marks;
	@ManyToOne
	private College c;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String sname, double marks, College c) {
		super();
		this.id = id;
		this.sname = sname;
		this.marks = marks;
		this.c = c;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public College getC() {
		return c;
	}
	public void setC(College c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", marks=" + marks + ", c=" + c + "]";
	}
	

}
