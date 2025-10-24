package bidirectional_many_to_1__1_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Book> book;
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int id, String name, List<Book> book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
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
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + "]";
	}
	
	

}
