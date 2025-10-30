package one_to_one_bidierctional_curd_operations;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
	@Id
	private int id;
	private String model;
	@OneToOne
	private SimCard sim;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int id, String model, SimCard sim) {
		super();
		this.id = id;
		this.model = model;
		this.sim = sim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public SimCard getSim() {
		return sim;
	}
	public void setSim(SimCard sim) {
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", model=" + model + "]";
	}
	
	
	
	
}
