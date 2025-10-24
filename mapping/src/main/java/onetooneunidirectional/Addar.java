package onetooneunidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Addar {
	@Id
	private int id;
	private long addar;
	private String address;
	public Addar(int id, long addar, String address) {
		super();
		this.id = id;
		this.addar = addar;
		this.address = address;
	}
	public Addar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAddar() {
		return addar;
	}
	public void setAddar(long addar) {
		this.addar = addar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Addar [id=" + id + ", addar=" + addar + ", address=" + address + "]";
	}
	
	

}
