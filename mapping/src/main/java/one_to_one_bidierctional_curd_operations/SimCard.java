package one_to_one_bidierctional_curd_operations;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SimCard {
@Id
private int id;
private String provider;
private long number;
@OneToOne
private Mobile m;
public SimCard() {
	super();
	// TODO Auto-generated constructor stub
}
public SimCard(int id, String provider, long number, Mobile m) {
	super();
	this.id = id;
	this.provider = provider;
	this.number = number;
	this.m = m;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProvider() {
	return provider;
}
public void setProvider(String provider) {
	this.provider = provider;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public Mobile getM() {
	return m;
}
public void setM(Mobile m) {
	this.m = m;
}
@Override
public String toString() {
	return "SimCard [id=" + id + ", provider=" + provider + ", number=" + number + "]";
}

}
