package manytomany;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	int id ;
	String title;
	int pages;
	@ManyToMany
	List<Author>author=new ArrayList<Author>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public List<Author> getAuthor() {
		return author;
	}
	public void setAuthor(List<Author> author) {
		this.author = author;
	}

}
