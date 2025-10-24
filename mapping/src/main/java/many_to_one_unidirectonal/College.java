package many_to_one_unidirectonal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private int id;
	private String cname;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", cname=" + cname + "]";
	}
	
	
}
