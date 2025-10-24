package bidirectional_many_to_1__1_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	private int id;
	private String name;
	private double price;
	@ManyToOne
	private Library l;
	public Book(int id, String name, double price, Library l) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.l = l;
	}
	public Book() {
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Library getL() {
		return l;
	}
	public void setL(Library l) {
		this.l = l;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
