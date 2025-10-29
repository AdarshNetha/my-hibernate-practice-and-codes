package onetoonebidierctional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Licence {
	@Id
	private int id;
	private int licenceNo;
	private String type;
	@OneToOne(cascade = CascadeType.ALL)
	private Driver d;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(int licenceNo) {
		this.licenceNo = licenceNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Driver getD() {
		return d;
	}
	public void setD(Driver d) {
		this.d = d;
	}
	public Licence(int id, int licenceNo, String type, Driver d) {
		super();
		this.id = id;
		this.licenceNo = licenceNo;
		this.type = type;
		this.d = d;
	}
	public Licence() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Licence [id=" + id + ", licenceNo=" + licenceNo + ", type=" + type + "]";
	}
	
	
}
