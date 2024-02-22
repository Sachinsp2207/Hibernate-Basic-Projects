package manytomany;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	@Id
	int id;
	String name;
	int Award;
	@ManyToMany
	List<Book>book =new ArrayList<Book>();
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
	public int getAward() {
		return Award;
	}
	public void setAward(int award) {
		Award = award;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
}
